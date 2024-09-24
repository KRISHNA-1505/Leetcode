class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> duplicatesSet = new HashSet<>();
        for(int element : nums) 
            if(!duplicatesSet.add(element))
                return true;
        return false;
    }
}