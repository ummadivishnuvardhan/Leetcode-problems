class Solution {
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public boolean helper(char[][] board, int row, int col) {
        // ✅ base case: if we have filled all rows
        if (row == 9) {
            return true;
        }

        // ✅ move to next cell
        int nextrow = row;
        int nextcol = col + 1;
        if (nextcol == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }

        if (board[row][col] != '.') {
            return helper(board, nextrow, nextcol);
        }

        for (char digit = '1'; digit <= '9'; digit++) {
            if (isSafe(row, col, board, digit)) {
                board[row][col] = digit;
                if (helper(board, nextrow, nextcol)) {
                    return true;
                }
                board[row][col] = '.'; // backtrack
            }
        }

        return false;
    }

    public boolean isSafe(int row, int col, char[][] board, char dig) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == dig || board[i][col] == dig) {
                return false;
            }
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == dig) {
                    return false;
                }
            }
        }

        return true;
    }
}
