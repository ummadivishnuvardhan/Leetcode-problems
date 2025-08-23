class Solution {
    public int characterReplacement(String s, int k) {
      int[] freq=new int[26];
      int maxwindow=0;

      int maxfreq=0;
      int left=0;
      for(int right=0;right<s.length();right++){
        freq[s.charAt(right)-'A']++;
        maxfreq=Math.max(maxfreq,freq[s.charAt(right)-'A']);
        int currwindow=right-left+1;
        if(currwindow-maxfreq>k){
            freq[s.charAt(left)-'A']--;
            left++;
        }
        currwindow=right-left+1;
        maxwindow=Math.max(currwindow,maxwindow);
      }
      return maxwindow;
    }
}