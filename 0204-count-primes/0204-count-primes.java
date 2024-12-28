class Solution {
    public int countPrimes(int n) {
        boolean[] p=new boolean[n];
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(p[i]==false)
            {
                c++;
                for(int j=2;i*j<n;j++){
                    p[i*j]=true;
                }
            }
        }
        return c;
    }
}