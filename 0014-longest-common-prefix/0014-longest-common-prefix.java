class Solution {
    public String longestCommonPrefix(String[] strs) {
  
        String word=strs[0];
    for(int i=1;i<strs.length;i++){
        StringBuilder res=new StringBuilder();
        String temp=strs[i];
        int j=0;
        while(j<temp.length()&&j<word.length()){
            if(word.charAt(j)==temp.charAt(j)){
                res.append(word.charAt(j));
                j++;
            }
            else{
                break;
            }
        }
        if(res.isEmpty()) return "";
       word=res.toString();
       
    }
     return word;
}
}
