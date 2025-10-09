class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().trim();
        int start=0,end=s.length()-1;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<=end;i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str.append(ch);
            }
        }
        end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}