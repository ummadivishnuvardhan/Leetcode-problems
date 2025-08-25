class Solution {
    public int findMin(int[] nums) {
      int low=0,high=nums.length-1;
      int min=Integer.MAX_VALUE;
      
      while(low<=high){
        int mid=(low+high)/2;
        if(nums[low]<=nums[mid]){
            min=Math.min(nums[low],min);
            low=mid+1;
        }
        else{
            high=mid-1;
            min=Math.min(nums[mid],min);
        }
      }
      return min;
    }
}