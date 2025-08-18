class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int prefix=0;
       
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            prefix+=nums[i];
            int rem=prefix%k;
            if(rem==0&&i>=1){
                return true;
            }
            if(map.containsKey(rem)){
                int idx=map.get(rem);
                if(i-idx>=2){
                    return true;
                }
            }
                else{
                    map.put(rem,i);
                
            }

        }  
        return false;

    }
}