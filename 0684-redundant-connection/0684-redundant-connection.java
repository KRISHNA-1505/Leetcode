class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int[] d=new int[n+1];
        Arrays.fill(d,-1);
        for(int[] edge:edges){
            int p=find(d,edge[0]);
            int q=find(d,edge[1]);
            if(p==q){
                return edge;
            }
            else
            d[p]=q;
        }
        return new int[]{0,0};
    }
    private int find(int[] d,int c){
        if(d[c]==-1)
        return c;
        return d[c] = find(d, d[c]); 

    }
}