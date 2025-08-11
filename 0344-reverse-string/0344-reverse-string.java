//Using Recursion

// class Solution {
//     public void reverseString(char[] s) {
//         StringBuilder str=new StringBuilder("");
//         for(int i=0;i<s.length;i++){
//             str.append(s[i]);
//         }
//         String rev=reverse(str.toString());
//         for(int i=0;i<rev.length();i++){
//             s[i]=rev.charAt(i);
//         }
//     }
//     public String reverse(String str){
//         if(str==""){
//             return "";
//         }
//         return reverse(str.substring(1))+str.charAt(0);
//     }
// }

//Using 2 pointers
class Solution{
    public void reverseString(char[] s) {
        int start=0,end=s.length-1;
        while(start<end){
            char ch=s[start];
            s[start]=s[end];
            s[end]=ch;
            start++;
            end--;
        }
    }
}