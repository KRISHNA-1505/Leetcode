class Solution {
    public List<String> stringMatching(String[] words) {
       Set<String> l=new HashSet<>();
       for(int i=0;i<words.length;i++){
        for(int j=0;j<words.length;j++){
            if(i!=j && words[j].indexOf(words[i])!=-1)
            l.add(words[i]);
        }
       } 
       return new ArrayList(l);
    }
}