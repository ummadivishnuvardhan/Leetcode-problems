import java.util.*;

class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> ans = new ArrayList<>();
        int n = maze.length;
        if (n == 0 || maze[0][0] == 0 || maze[n-1][n-1] == 0) return ans;

        boolean[][] vis = new boolean[n][n];
        helper(ans, "", maze, 0, 0, vis, n);   // start at (0,0)
        Collections.sort(ans);                 // GFG expects lexicographic
        return ans;
    }

    private void helper(ArrayList<String> ans, String path, int[][] a, int r, int c, boolean[][] vis, int n) {
        if (r == n - 1 && c == n - 1) { ans.add(path); return; }
        vis[r][c] = true;

        // D, L, R, U (GFG order)
        if (r + 1 < n && a[r + 1][c] == 1 && !vis[r + 1][c]) helper(ans, path + "D", a, r + 1, c, vis, n);
        if (c - 1 >= 0 && a[r][c - 1] == 1 && !vis[r][c - 1]) helper(ans, path + "L", a, r, c - 1, vis, n);
        if (c + 1 < n && a[r][c + 1] == 1 && !vis[r][c + 1]) helper(ans, path + "R", a, r, c + 1, vis, n);
        if (r - 1 >= 0 && a[r - 1][c] == 1 && !vis[r - 1][c]) helper(ans, path + "U", a, r - 1, c, vis, n);

        vis[r][c] = false; // backtrack
    }
}
