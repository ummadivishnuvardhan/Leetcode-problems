class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currsum=0,sum=0,total=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<nums.length;i++){
            currsum=Math.max(nums[i],currsum+nums[i]);
            sum=Math.min(nums[i],sum+nums[i]);
            maxsum=Math.max(maxsum,currsum);
            minsum=Math.min(minsum,sum);
            total+=nums[i];
        }
        if(maxsum<0) return maxsum;
        return res=Math.max(maxsum,total-minsum);
    }
}