class Solution {
    public void swap(int a,int b,int[] nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int n=nums.length-1;
        int mid=0,low=0,high=n;
        
        while(mid<=high){
            if(nums[mid]==0){
                swap(mid,low,nums);
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(mid,high,nums);
                high--;
            }
        }
    }
}