class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // build prefix sum array
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        for (int j = 0; j < n; j++) {
            int val = prefix[j] - k;

            // case 1: subarray [0..j] itself equals k
            if (prefix[j] == k) {
                count++;
            }

            // case 2: if prefix[j] - k already seen, add its frequency
            if (map.containsKey(val)) {
                count = count + map.get(val);
            }

            // update frequency of prefix[j] in map
            if (map.containsKey(prefix[j])) {
                int freq = map.get(prefix[j]);
                map.put(prefix[j], freq + 1);
            } else {
                map.put(prefix[j], 1);
            }
        }

        return count;
    }
}
