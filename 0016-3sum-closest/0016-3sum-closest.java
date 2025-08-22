class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int max=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int start=i;
            int mid=i+1;
            int end=nums.length-1;
            while(mid<end){
                sum=nums[start]+nums[mid]+nums[end];
                int minus=sum-1,plus=sum+1;
                if(minus==target){
                    max=sum;
                    return max;
                }
                else if(plus==target){
                    max=sum;
                    return max;
                }
                else if(sum==target){
                    max=sum;
                    return max;
                }
                
                else{
                    if(sum>target){
                        mid++;
                    }
                    else{
                        end--;
                    }
                }
            }
        }
        return sum;
    }
}