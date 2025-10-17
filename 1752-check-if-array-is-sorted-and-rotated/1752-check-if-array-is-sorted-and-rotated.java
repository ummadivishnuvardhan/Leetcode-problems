class Solution {
    public boolean check(int[] nums) {
        int mid=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                rotate(nums,i);
                break;
            }
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                return false;
            }
        }
        return true;
    }
    public void rotate(int[] nums,int mid){
        reverse(nums,0,mid-1);
        reverse(nums,mid,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}