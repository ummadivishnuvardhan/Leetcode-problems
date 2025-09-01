class Solution {
    public int rob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        int[] skipLastHouse=new int[nums.length-1];
        int[] firstLastHouse=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            skipLastHouse[i]=nums[i];
            firstLastHouse[i]=nums[i+1];
        }
        int lootskipLastHouse=houserob(skipLastHouse);
        int lootfirstLastHouse=houserob(firstLastHouse);
        return Math.max(lootskipLastHouse,lootfirstLastHouse);
    }
      public int houserob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],nums[0]);
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
    return dp[nums.length-1];
    }
}