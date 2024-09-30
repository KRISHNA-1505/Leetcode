class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length==0) {
            return 0;
        }

        for(int i=0;i<nums.length;i++) {
            int val = Math.abs(nums[i]);
            if(nums[val] < 0) {
                return val;
            } else {
                nums[val] = -1 * nums[val];
            }
        }
        return -1;
    }
}