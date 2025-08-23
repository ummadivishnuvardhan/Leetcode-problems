class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0,high=0;
        int windsize=0,maxw=Integer.MAX_VALUE;
        int sum=0;
        while(high<nums.length){
            sum+=nums[high];
            high++;
            while(sum>=target){
                windsize=high-low;
                maxw=Math.min(maxw,windsize);
                sum-=nums[low];
                low++;
            }
        }
        return maxw==Integer.MAX_VALUE?0:maxw;
    }
}