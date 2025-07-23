// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        char[] ch=s.toCharArray();
        int l=0,r=s.length()-1;
        while(l<r){
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
        s=new String(ch);
        return s;
    }
}