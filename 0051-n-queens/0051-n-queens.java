class Solution {

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();

        List<String> board = new ArrayList<>();

        String s = ".".repeat(n);

        for (int i = 0; i < n; i++) {
            board.add(s);
        }

        solve(0, board, result, n);

        return result;
    }

    public void solve(int col, List<String> board,
                      List<List<String>> result, int n) {
        if (col == n) {
            result.add(new ArrayList<>(board));
            return;
        }

        for (int row = 0; row < n; row++) {

            if (isSafe(row, col, board, n)) {

                StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(col, 'Q');
                board.set(row, sb.toString());
                solve(col + 1, board, result, n);
                sb = new StringBuilder(board.get(row));
                sb.setCharAt(col, '.');
                board.set(row, sb.toString());
            }
        }
    }

    public boolean isSafe(int row, int col,
                           List<String> board, int n) {
        int r = row - 1;
        int c = col - 1;

        while (r >= 0 && c >= 0) {
            if (board.get(r).charAt(c) == 'Q') {
                return false;
            }
            r--;
            c--;
        }
        r = row;
        c = col - 1;

        while (c >= 0) {
            if (board.get(r).charAt(c) == 'Q') {
                return false;
            }
            c--;
        }

        r = row + 1;
        c = col - 1;

        while (r < n && c >= 0) {
            if (board.get(r).charAt(c) == 'Q') {
                return false;
            }
            r++;
            c--;
        }

        return true;
    }
}