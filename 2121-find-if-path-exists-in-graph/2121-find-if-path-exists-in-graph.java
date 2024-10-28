class Solution {
  public int find(int[] parent, int x) {
    if (parent[x] != x) {
      parent[x] = find(parent, parent[x]);
    }
    return parent[x];
  }

  public void union(int[] parent, int x, int y) {
    int r1 = find(parent, x);
    int r2 = find(parent, y);
    if (r1 != r2) {
      parent[r1] = r2;
    }
  }

  public boolean validPath(int n, int[][] edges, int source, int destination) {
    int[] parent = new int[n];
    for (int i = 0; i < n; i++) {
      parent[i] = i;
    }
    for (int i = 0; i<edges.length; i++) {
      union(parent, edges[i][0], edges[i][1]);
    }
    return find(parent, source) == find(parent, destination);
  }
}