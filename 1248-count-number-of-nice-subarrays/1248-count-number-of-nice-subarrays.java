class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       
     return helper(nums,k)-helper(nums,k-1);
    }
    public int helper(int[] nums,int goal){
        if(goal<0){
            return 0;
        }
         int low=0;
        int count=0;
        int sum=0;
        for(int high=0;high<nums.length;high++){
          sum+=nums[high]%2;
          while(sum>goal){
            sum-=nums[low]%2;
            low++;
          }
          count+=high-low+1;
         
        }
        return count;
    }
}