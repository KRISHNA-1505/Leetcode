class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        if(n<=1)
        {
            return 0;
        }
        int c=0;
        int num=nums[0];
        for(int i=1;i<n;i++)
        {
            if(num==nums[i])
            {
                c++;
                num++;
            }
            else if(num>nums[i])
            {
                num++;
                c+=num-nums[i];
            }
            else
            num=nums[i];
        }
        return c;
    }
}