class Solution {
    public int numSubmat(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] height = new int[m][n];

        // Build histogram heights
        for (int j = 0; j < n; j++) {
            height[0][j] = mat[0][j];
            for (int i = 1; i < m; i++) {
                height[i][j] = (mat[i][j] == 0) ? 0 : height[i - 1][j] + 1;
            }
        }

        int ans = 0;
        for (int i = 0; i < m; i++) {
            ans += countRow(height[i]);
        }
        return ans;
    }

    // Count rectangles for one histogram row
    private int countRow(int[] h) {
        int n = h.length;
        int sum = 0;
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        int[] dp = new int[n];

        for (int j = 0; j < n; j++) {
            while (!stack.isEmpty() && h[stack.peek()] >= h[j]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                int prev = stack.peek();
                dp[j] = dp[prev] + h[j] * (j - prev);
            } else {
                dp[j] = h[j] * (j + 1);
            }
            stack.push(j);
            sum += dp[j];
        }
        return sum;
    }
}
