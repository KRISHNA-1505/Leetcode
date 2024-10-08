class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();

        findSolution(candidates, target, 0, 0, new ArrayList<>(), combinations);

        return combinations;
    }

    private void findSolution(int[] candidates, int target, int index, int currSum, List<Integer> combination,
            List<List<Integer>> combinations) {
        if (currSum == target) {
            combinations.add(new ArrayList<>(combination));
            return;
        }
        
        if(currSum > target || index >= candidates.length) {
            return;
        }

        combination.add(candidates[index]);
        findSolution(candidates, target, index, currSum + candidates[index], combination, combinations);
        combination.remove(combination.size() -1);
        findSolution(candidates, target, index + 1, currSum, combination, combinations);

    }

}