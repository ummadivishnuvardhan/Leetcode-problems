class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
             sum=Math.max(nums[i],nums[i]+sum);
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}