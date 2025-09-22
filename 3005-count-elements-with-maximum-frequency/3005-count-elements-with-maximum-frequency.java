class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=0;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int val=map.get(nums[i]);
                map.put(nums[i],val+1);
            }
            int val=map.get(nums[i]);
            max=Math.max(val,max);
        }   
        for(int ele:map.keySet()){
            int freq=map.get(ele);
            
            if(max==freq){
                count+=freq;
            }
        }
        return count;
    }
}