class Solution {
    public int maxAscendingSum(int[] nums) {
        int s=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                s+=nums[i];
            }
            else
            s=nums[i];
            max=Math.max(s,max);


        }
        return max;
    }
}