class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int t=nums[k];
                nums[k++]=nums[i];
                nums[i]=t;
            }
        }
        
        return nums;
    }
}