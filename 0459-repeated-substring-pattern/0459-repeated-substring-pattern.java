class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int i=n/2;i>=1;i--){
            if(n%i==0){
                String str=s.substring(0,i);
                StringBuilder strs=new StringBuilder();
                for(int j=1;j<=n/i;j++){
                    strs.append(str);
                }
                if(strs.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}