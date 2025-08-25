class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Base case: found the target
            if (nums[mid] == target) {
                return true;
            }
            if(nums[low]==nums[mid]&&nums[mid]==nums[high]){
                low=low+1;
                high=high-1;
                continue;
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
        return false;
    }
}
