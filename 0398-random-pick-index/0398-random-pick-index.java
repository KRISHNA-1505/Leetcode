class Solution {

    private Map<Integer, List<Integer>> map;
    private Random random;

    public Solution(int[] nums) {
        map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            List<Integer> indexes = map.get(n);
            if (indexes == null) {
                indexes = new ArrayList<>();
                map.put(n, indexes);
            }
            indexes.add(i);
        }
        random = new Random();
    }

    public int pick(int target) {
        List<Integer> indexes = map.get(target);
        return indexes.get(random.nextInt(indexes.size()));
    }

}
