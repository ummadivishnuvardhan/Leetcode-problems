class Solution {
    public int maxProduct(int[] nums) {
        int maxprod=nums[0];
        int maxsofar=nums[0];
        int minsofar=nums[0];
        for(int i=1;i<nums.length;i++){
            int temp=maxsofar;
            maxsofar=Math.max(nums[i],Math.max(nums[i]*maxsofar,nums[i]*minsofar));
            minsofar=Math.min(nums[i],Math.min(nums[i]*temp,nums[i]*minsofar));
            maxprod=Math.max(maxsofar,maxprod);
        }
        return maxprod;
    }
}