class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Base case: found the target
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[low] <= nums[mid]) {
                // Target in left half
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else { // Target in right half
                    low = mid + 1;
                }
            }
            // Right half is sorted
            else {
                // Target in right half
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else { // Target in left half
                    high = mid - 1;
                }
            }
        }

        // Target not found
        return -1;
    }
}
