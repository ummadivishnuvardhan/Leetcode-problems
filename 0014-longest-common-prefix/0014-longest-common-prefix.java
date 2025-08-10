class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String word = strs[0];
        String res = "";

        for (int i = 1; i < strs.length; i++) {
            String temp = strs[i];
            res = "";
            int j = 0;

            while (j < word.length() && j < temp.length()) {
                if (word.charAt(j) == temp.charAt(j)) {
                    res += word.charAt(j);
                } else {
                    break;
                }
                j++;
            }

            word = res; // update prefix so far

            if (word.isEmpty()) { // no common prefix possible anymore
                return "";
            }
        }
        return word;
    }
}
