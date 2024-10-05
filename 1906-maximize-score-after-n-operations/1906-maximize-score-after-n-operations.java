class Solution {

    public int maxScore(int[] nums) {
        int n = nums.length, m = 1 << n;
        int[] dp = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                dp[1 << i | 1 << j] = gcd(nums[i], nums[j]);
            }
        }
        for (int s = 0; s < m; s++) {
            int count = Integer.bitCount(s);
            if (count <= 2 || (count & 1) != 0) {
                continue;
            }
            count >>= 1;
            int max = 0;
            for (int x = s, lowbitx; x > 0; x -= lowbitx) {
                lowbitx = x & -x;
                for (int y = (x ^ lowbitx), lowbity; y > 0; y -= lowbity) {
                    lowbity = y & -y;
                    int mask = lowbitx | lowbity;
                    max = Math.max(dp[s ^ mask] + count * dp[mask], max);
                }
            }
            dp[s] = max;
        }
        return dp[m - 1];
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}