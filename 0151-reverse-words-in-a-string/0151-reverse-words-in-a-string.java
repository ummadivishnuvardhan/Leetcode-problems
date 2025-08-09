class Solution {
    public String reverseWords(String s) {
        s = s.trim(); // Remove leading/trailing spaces
        int n = s.length() - 1;
        StringBuilder ans = new StringBuilder();

        // Step 1: Reverse the whole string
        s = reverse(0, n, s).toString();

        // Step 2: Reverse each word
        for (int i = 0; i <= n; i++) {
            StringBuilder word = new StringBuilder();

            // Build the word
            while (i <= n && s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i++;
            }

            // Reverse the word
            word = reverse(0, word.length() - 1, word.toString());

            // Append word to result without leading extra space
            if (word.length() > 0) {
                if (ans.length() > 0) ans.append(" ");
                ans.append(word);
            }
        }

        return ans.toString();
    }

    public StringBuilder reverse(int left, int right, String s) {
        StringBuilder str = new StringBuilder(s);
        while (left < right) {
            char ch1 = str.charAt(left);
            str.setCharAt(left, str.charAt(right));
            str.setCharAt(right, ch1);
            left++;
            right--;
        }
        return str;
    }
}
