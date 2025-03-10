class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int max=0,lsum=0,rsum=0;
        for(int i=0;i<k;i++)
        lsum+=cardPoints[i];
        max=lsum;
        int j=n-1;
        for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[j];
            j-=1;
            max=Math.max(max,lsum+rsum);
        }
        return max;

    }
}