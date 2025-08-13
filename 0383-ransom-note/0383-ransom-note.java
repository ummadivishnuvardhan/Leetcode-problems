//  int a[]=new int[26];
//         for(int i=0;i<ransomNote.length();i++){
//             char ch=ransomNote.charAt(i);
//             a[ch-'a']++;
//         }
//         for(int i=0;i<magazine.length();i++){
//             char ch=magazine.charAt(i);
//             a[ch-'a']--;
//         }
//         for(int i=0;i<ransomNote.length();i++){
//             char ch=ransomNote.charAt(i);
//             if(a[ch-'a']==0){

//             }
//             else{
//                 return false;
//             }
//         }
//         return true;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int count=0;
     int a[]=new int[26];
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            a[ch-'a']++;
        }
       for(int i=0;i<ransomNote.length();i++){
           
            char ch=ransomNote.charAt(i);
            if(a[ch-'a']==0){
                return false;
            }
           a[ch-'a']--;
       }
         
        return true;
      
    }
}