class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int k = 2; // pointer for the "valid position" (allow 2 duplicates)

        for (int i = 2; i < nums.length; i++) {
            // Only allow nums[i] if it’s greater than nums[k-2]
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k; // new length
    }
}
