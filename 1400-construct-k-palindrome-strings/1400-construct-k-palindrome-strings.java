class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()==k) return true;
        if(s.length()<k) return false;
        int[] t=new int[26];
         Arrays.fill(t,0);
            for(char ch:s.toCharArray()){
                t[ch-'a']++;
            }
        int o=0;
        for(int i=0;i<26;i++){
            if(t[i]%2!=0)
            o++;
        }
        return o<=k;
    }
}