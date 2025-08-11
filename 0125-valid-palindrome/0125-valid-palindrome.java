class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        s=s.toLowerCase();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97&&s.charAt(i)<=122||s.charAt(i)>='0'&&s.charAt(i)<='9'){
                str.append(s.charAt(i));
            }
        }
        int left=0,right=str.length()-1;
        while(left<=right){
            if(str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}