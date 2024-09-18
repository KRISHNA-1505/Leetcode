class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] l=new int[n];
        int[] r=new int[n];
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(height[i]>max)
            {
                max=height[i];
            }
            l[i]=max;
        }
        max=-1;
        for(int i=n-1;i>=0;i--)
        {
            if(height[i]>=max)
            {
                max=height[i];
            }
            r[i]=max;
        }
        for(int i=0;i<n;i++)
        {
            ans+=Math.min(l[i],r[i])-height[i];
        }
        return ans;
    }
}