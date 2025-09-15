class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map=new HashMap<>();
       for(String str:strs){
            String freq=getFrequency(str);
            if(map.containsKey(freq)){
                map.get(freq).add(str);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(freq,list);
            }
       }
        return new ArrayList<>(map.values());
    }
    public String getFrequency(String s){
        int[] freq=new int[26];
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
        } 

        char c='a';
        StringBuilder str=new StringBuilder();
        for(int i:freq){
            str.append(c);
            str.append(i);
        }
        return str.toString();
    }
}