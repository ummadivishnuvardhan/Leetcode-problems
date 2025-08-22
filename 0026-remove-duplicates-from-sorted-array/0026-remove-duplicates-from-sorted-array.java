class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<2){
            return nums.length; 
        }
        int start=0,end=1;
        while(end<nums.length){
            if(nums[start]!=nums[end]){
                start++;
                nums[start]=nums[end];
            }
            else{
                end++;
            }
        }
        return start+1;
    }
}