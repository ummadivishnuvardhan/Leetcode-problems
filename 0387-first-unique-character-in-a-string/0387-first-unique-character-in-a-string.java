//Brute force

// class Solution {
//     public int firstUniqChar(String s) {
//         Map<Character,Integer> map=new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(!map.containsKey(ch)){
//                 map.put(ch,1);
//             }
//             else{
//                 map.put(ch,map.get(ch)+1);
//             }
//         }   
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(map.get(ch)==1){
//                return i;
//             }
//         }
//         return -1;
//     }
// }

//optimal

class Solution{
    public int firstUniqChar(String s){
        int a[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            a[ch-'a']++;
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(a[ch-'a']==1){
                return i;
            }
        }
        return -1;
    }
}