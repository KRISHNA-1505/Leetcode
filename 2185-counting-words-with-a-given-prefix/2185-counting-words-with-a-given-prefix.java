class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=pref.length(),c=0,m=0;
        for(int i=0;i<words.length;i++){
            if(words[i].length()>=n){
            for(int j=0;j<n;j++){
                if(words[i].charAt(j)==pref.charAt(j))
                c++;
                else
                break;
            }
            if(n==c) m++;
            }
            c=0;
        }
        return m;
    }
}