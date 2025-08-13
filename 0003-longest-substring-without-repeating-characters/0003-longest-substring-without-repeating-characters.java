class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
       Set<Character> set=new HashSet<>();
       int left=0;
       int max=Integer.MIN_VALUE;
       for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            max=Math.max(max,right-left+1);
       }
        
        return max;
    }
}