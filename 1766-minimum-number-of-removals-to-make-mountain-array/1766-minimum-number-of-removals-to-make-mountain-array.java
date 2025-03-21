class Solution {
    public int minimumMountainRemovals(int[] nums) {
               int n=nums.length;
        int[] lis=new int[n];
        int[] lis1=new int[n];
        int[] dp=new int[n];
        int[] dp1=new int[n];
        int len=0;
        int j=0;
        for(int a:nums){
            int i= Arrays.binarySearch(lis,0,len,a);
            if(i<0){
                i=-(i+1);
            }
            lis[i]=a;
            if(len==i){
                len++;
            dp[j]=len;
            }else{
                dp[j]=i+1;
            }
            j++;
        }
        int len1=0;
        for(int i=n-1;i>=0;i--){
            int k=Arrays.binarySearch(lis1,0,len1,nums[i]);
            if(k<0){
                k=-(k+1);
            }
            lis1[k]=nums[i];
            if(len1==k){
                len1++;
            dp1[i]=len1;
            }else{
                dp1[i]=k+1;
            }
        }
        int max=0;
        for(int i=1;i<n-1;i++){
            if(dp[i]>1 && dp1[i]>1)
                max=Math.max(max,dp[i]+dp1[i]);
        }
        return n-max+1;
    }
}