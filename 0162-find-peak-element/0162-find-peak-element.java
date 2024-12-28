class Solution {
    public int findPeakElement(int[] nums) {
        int t=0;
        int c=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>c)
            {
                c=nums[i];
                t=i;
            }
        }
        return t;
    }
}