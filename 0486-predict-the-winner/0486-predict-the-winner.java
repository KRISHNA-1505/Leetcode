class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int[][] d=new int[n][n];
        for(int i=0;i<n;i++)
        {
            d[i][i]=nums[i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++)
            {
                int k=i+j;
                d[j][k]=Math.max(nums[j]-d[j+1][k],nums[k]-d[j][k-1]);
            }
        }
        return d[0][n-1]>=0;
    }
}