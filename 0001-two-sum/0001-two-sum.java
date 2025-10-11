class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int res=target-nums[i];
            if(!map.containsKey(res)){
                map.put(nums[i],i);
            }
            else if(map.containsKey(res)){
                arr[0]=map.get(res);
                arr[1]=i;
            }
        }
        return arr;
    }
}