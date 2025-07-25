class Solution {
    public int maxSum(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0,nsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])&&nums[i]>0){
                map.put(nums[i],i);
                sum=sum+nums[i];
            }
            else if(nums[i]<=0){
                nsum=Math.max(nsum,nums[i]);
            }
        }   
        if(!map.isEmpty())
        return sum;
        else return nsum;
    }
}