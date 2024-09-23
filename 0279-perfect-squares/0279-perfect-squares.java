class Solution {
    public int numSquares(int n) {
        int[] a=new int[n+1];
        Arrays.fill(a,n);
        a[0]=0;
        a[1]=1;
        for(int i=2;i<=n;++i)
        {
            for(int j=1;j*j<=i;++j){
                a[i]=Math.min(a[i],a[i-j*j]+1);
            }
        }
        return a[n];
    }
}