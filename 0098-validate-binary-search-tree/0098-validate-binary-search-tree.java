
class Solution {
    public boolean isValidBST(TreeNode root) {
        long[] res = dfs(root);
        return res == null ? false : true;
    }
    private long[] dfs(TreeNode root) {
        if (root == null) {
            return new long[]{Long.MAX_VALUE, Long.MIN_VALUE, 1};
        }
        long[] l = dfs(root.left);
        long[] r = dfs(root.right);
        if (l == null || r == null) {
            return null;
        }
        if (l[1] < root.val && root.val < r[0]) {
            long ll = Math.min(l[0], root.val);
            long rr = Math.max(root.val, r[1]);
            long isBst = l[2] * r[2];
            return new long[]{ll, rr, isBst};
        }
        return null;
    }
}