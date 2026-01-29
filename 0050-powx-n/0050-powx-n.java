class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long m = n;      // CHANGED
        long n1 = n;     // CHANGED

        if (n1 < 0) {
            n1 = n1 * -1;
        }

        while (n1 > 0) {
            if (n1 % 2 == 1) {
                ans = ans * x;
                n1 = n1 - 1;
            } else {
                x = x * x;
                n1 = n1 / 2;
            }
        }

        if (m < 0) {
            return 1.0 / ans;
        }
        return ans;
    }
}
