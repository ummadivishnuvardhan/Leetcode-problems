class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        StringBuilder sb = new StringBuilder(goal);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.toString().equals(s)) return true;

            // rotate by moving first char to end
            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
        }
        return false;
    }
}
