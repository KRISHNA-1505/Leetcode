class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>s=new ArrayList<>();
        rec(s,0,0,"",n);
        return s;
    }
    public void rec(List<String> s,int l,int r,String k,int n)
    {
        if(k.length()==n*2){
            s.add(k);
            return;
        }
        if(l<n){
            rec(s,l+1,r,k+"(",n);
        }
        if(r<l){
            rec(s,l,r+1,k+")",n);
        }
    }
}