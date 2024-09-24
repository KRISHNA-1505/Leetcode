class Solution {
    public int[] decrypt(int[] code, int k) {
       int n=code.length;
       int[] a=new int[n];
       if(k==0)
       {
        Arrays.fill(a,0);
        return a;
       }
       else if(k>0){
        for(int i=0;i<n;i++)
        {
            int s=0;
            for(int j=1;j<=k;j++)
            {
                s+=code[(i+j)%n];
            }
            a[i]=s;
        }
        return a;
       }
       else
       {
        for(int i=0;i<n;i++)
        {
            int s=0;
            for(int j=1;j<=-1*k;j++)
            {
                s+=code[(i-j+n)%n];
            }
            a[i]=s;
        }
        return a;
       }
           }
}