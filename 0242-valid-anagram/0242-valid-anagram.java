class Solution {
    public boolean isAnagram(String s, String t) {
       int[] a=new int[26];
       for(int i=0;i<s.length();i++){
            int letter=s.charAt(i)-'a';
            a[letter]++;
       }
        for(int i=0;i<t.length();i++){
            int letter=t.charAt(i)-'a';
            a[letter]--;
       }
       for(int i=0;i<26;i++){
        if(a[i]!=0){
            return false;
        }
       }
       return true;

    }
}