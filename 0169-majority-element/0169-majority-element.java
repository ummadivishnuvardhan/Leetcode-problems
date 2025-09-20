class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int count=map.get(nums[i]);
                map.put(nums[i],count+1);
            }
        } 

        int element=0;
        for(int i=0;i<n;i++){
            if(map.get(nums[i])>n/2){
                element=nums[i];
                break;
            }
        }
        return element;
    }
}