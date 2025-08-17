class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        
        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 == 1) { // check odd
                return num.substring(0, i + 1);
            }
        }
        
        return ""; // no odd digit found
    }
}
