import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];

            // Pop all smaller elements
            while (!s.isEmpty() && num > s.peek()) {
                s.pop();
            }

            // Set next greater element or -1
            if (!s.isEmpty()) {
                map.put(num, s.peek());
            } else {
                map.put(num, -1);
            }

            // Push current element to stack
            s.push(num);
        }

        // Build result using nums1
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.get(nums1[i]);
        }

        return nums1;
    }
}
