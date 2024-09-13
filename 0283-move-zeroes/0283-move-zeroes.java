class Solution {
    public void moveZeroes(int[] nums) {
        int i,j=0;
        int n=nums.length;
        for(i=0;i<nums.length;i++)
        {
           if(nums[i]!=0)
           {
            nums[j]=nums[i];
            j++;
           }
    }
    for(;j<n;j++)
        nums[j]=0;
   }
    
}