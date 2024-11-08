class Solution {
    int N;
    boolean[] colOc;
    boolean[] fwdOc;
    boolean[] bckOc;
    public int getfwdPos(int r, int c) {
        return r+c;
    }

    public int getbckPos(int r, int c) {
        return (N-1) - r + c;
    }

    public List<String> genBoardFromPos(int[] qPos) {
        List<String> board = new ArrayList<>(qPos.length);
        StringBuilder boardRow = new StringBuilder();
        for (int i=0; i<N; i++) {
            boardRow.append('.');
        }
        for (int i=0; i<N; i++) {
            boardRow.setCharAt(qPos[i], 'Q');
            board.add(boardRow.toString());
            boardRow.setCharAt(qPos[i], '.');
        }
        return board;
    }

    public void backtrack(int r, int[] qPos, List<List<String>> allPos) {
        if (r==N) {
            allPos.add(genBoardFromPos(qPos));
        }
        for (int i=0; i<N; i++) {
            if (!colOc[i] && !fwdOc[getfwdPos(r,i)] && !bckOc[getbckPos(r, i)]) {
                colOc[i] = true;
                fwdOc[getfwdPos(r, i)] = true;
                bckOc[getbckPos(r, i)] = true;
                qPos[r] = i;
                backtrack(r+1, qPos, allPos);
                colOc[i] = false;
                fwdOc[getfwdPos(r, i)] = false;
                bckOc[getbckPos(r, i)] = false;
                qPos[r] = -1;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        N = n;
        colOc = new boolean[N];
        fwdOc = new boolean[2*N-1];
        bckOc = new boolean[2*N-1];
        int[] qPos = new int[N];
        Arrays.fill(qPos, -1);
        List<List<String>> ans = new ArrayList<>();
        backtrack(0, qPos, ans);
        return ans;
    }
}