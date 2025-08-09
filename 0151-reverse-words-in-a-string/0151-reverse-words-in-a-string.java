class Solution {
    public String reverseWords(String s) {
        int n=s.length()-1;
        StringBuilder ans=new StringBuilder();
        s=reverse(0,n,s).toString();
        for(int i=0;i<=n;i++){
           StringBuilder word=new StringBuilder();
           while(i<=n&&s.charAt(i)!=' '){
            word.append(s.charAt(i));
            i++;
           }
           word=reverse(0,word.length()-1,word.toString());
           if(word.length()>0){
            ans.append(" ");
            ans.append(word);
           }
            
        }
        return ans.substring(1).toString();

    }
    public StringBuilder reverse(int left,int right,String s){
        StringBuilder str=new StringBuilder(s);
        while(left<right){
            char ch1=str.charAt(left);
           str.setCharAt(left,str.charAt(right));
           str.setCharAt(right,ch1);
            left++;
            right--;
        }
        return str;
    }
}