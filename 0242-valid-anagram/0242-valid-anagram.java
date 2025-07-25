class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabet=new int[26];
        s=s.toLowerCase();
        t=t.toLowerCase();
       
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            alphabet[ch-'a']+=1;
        }
         for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            alphabet[ch-'a']-=1;
        }

        for(int i=0;i<26;i++){
            if(alphabet[i]!=0){
                return false;
            }
        }
        return true;
    }
}