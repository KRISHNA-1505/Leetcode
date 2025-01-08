class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(isPrefixAndSuffix(words[i],words[j]))
                c++;
            }
        }
        return c;
    }
    public boolean isPrefixAndSuffix(String a,String b){
        if(a.length()>b.length())
        return false;
        int i=0,j=0;
        boolean p=false,s=false;
        while(i<a.length())
        {
            if(a.charAt(i)==b.charAt(j)){
                i++;
                j++;
            }
            else
            break;
        }
        if(i==a.length())
        p=true;
        i=a.length()-1;
        j=b.length()-1;
        while(i>=0){
            if(a.charAt(i)==b.charAt(j)){
                i--;
                j--;
            }
            else
            break;
        }
        if(i<0)
        s=true;
        if(p==true && s==true )
        return true;
        else
         return false;
    }
}