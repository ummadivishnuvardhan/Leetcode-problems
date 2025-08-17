class Solution {
    public int strStr(String haystack, String needle) {
        int sl=haystack.length();
        int pl=needle.length();
        int table[]=new int[pl];
        patternTable(table,pl,needle);
        int i=0;
        int j=0;
        while(i<sl){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            if(j==pl){
                return i-j;
            }
            else if(i<sl&&haystack.charAt(i)!=needle.charAt(j)){
                if(j!=0){
                    j=table[j-1];
                }
                else{
                    i=i+1;
                }
            }
           
        }
         return -1;
    }
    public void patternTable(int[] table,int n,String p){
        int i=0;
        int j=1;
        table[0]=0;
        while(j<n){
            if(p.charAt(i)==p.charAt(j)){
                i++;
                table[j]=i;
                j++;
            }
            else{
                if(i!=0){
                    i=table[i-1];
                }
                else{
                    table[j]=i;
                    j++;
                }
            }
        }
    }

}