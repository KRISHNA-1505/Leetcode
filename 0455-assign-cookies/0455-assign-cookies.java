class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m = g.length;
        int n = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = m - 1;
        int j = n - 1;
        while(i >= 0 && j >= 0){
            if(g[i] <= s[j]){
                count++;
                j--;
            }
            i--;
        }
        return count;
    }
}