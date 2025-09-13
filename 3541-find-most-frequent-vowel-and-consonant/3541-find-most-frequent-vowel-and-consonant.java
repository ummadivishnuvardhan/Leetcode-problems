class Solution {
    public int maxFreqSum(String s) {
        int[] arr=new int[26];
        String str="aeiou";
        int vowmax=0;
        int conmax=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           arr[ch-'a']++;
           if(str.contains(ch+"")){
                 vowmax=Math.max(vowmax,arr[ch-'a']);
           }
           else{
                conmax=Math.max(conmax,arr[ch-'a']);
           } 
        }
        return vowmax+conmax;
    }
}