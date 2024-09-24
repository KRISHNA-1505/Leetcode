class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> n=new HashSet<>();
        for(int num:nums)
        n.add(num);
        return n.size() < nums.length;
    }
}