class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int maxsum = (maxChoosableInteger*(maxChoosableInteger+1))/2;
        if(maxsum < desiredTotal)
            return false;

        byte[] memo = new byte[1 << maxChoosableInteger];
        return helper(0, maxChoosableInteger, 0, desiredTotal, memo);
    }
    private boolean helper(int nums, int len,  int curr, int total, byte[] memo) {
        if(memo[nums] != 0) {
           return memo[nums] == 1;
        }
        for(int i = 0; i < len; i++) {
            if((nums & (1 << i)) == 0) {
                if(curr + i +1 >= total || !helper((nums| (1<<i)), len, 
                 curr + i +1, total, memo)) {
                    memo[nums] = 1;
                    return true;
                }
            }
        }
        memo[nums] =2;
        return false;
    } 
}