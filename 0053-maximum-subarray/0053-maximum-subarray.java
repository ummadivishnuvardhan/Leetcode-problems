class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=Math.max(nums[i],nums[i]+sum);
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
}