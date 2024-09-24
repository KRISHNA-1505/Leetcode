class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int remSum = target-nums[i];
            if(hs.containsKey(remSum)){
                return new int[]{hs.get(remSum),i};
            }
            else{
                hs.put(nums[i],i);
            }
        }

        return new int[]{};
    }
}