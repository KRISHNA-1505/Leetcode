import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }
        int maxTypes = Math.min(uniqueCandies.size(), candyType.length / 2);

        return maxTypes;
    }
}
