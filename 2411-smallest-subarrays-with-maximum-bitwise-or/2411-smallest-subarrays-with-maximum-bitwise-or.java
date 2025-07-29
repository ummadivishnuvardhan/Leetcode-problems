class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] nearest = new int[32];
        Arrays.fill(nearest, -1);
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < 32; j++) {
                if ((nums[i] & (1 << j)) != 0) {
                    nearest[j] = i;
                }
            }

            int lastSetBit = i;
            for (int j = 0; j < 32; j++) {
                if (nearest[j] != -1) {
                    lastSetBit = Math.max(lastSetBit, nearest[j]);
                }
            }

            ans[i] = lastSetBit - i + 1;
        }

        return ans;
    }
}