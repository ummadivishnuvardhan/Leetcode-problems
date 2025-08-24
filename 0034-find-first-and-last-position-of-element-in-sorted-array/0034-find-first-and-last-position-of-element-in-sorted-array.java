class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int[] arr={-1,-1};
        if(nums.length==0){
            return arr;
        }
        int lowb=lb(nums,target);
        if(lowb==nums.length||nums[lowb]!=target) return arr;
        arr[0]=lowb;
        
        arr[1]=ub(nums,target)-1;
        return arr;
        
    }
    public int lb(int nums[],int target){
        int ans=nums.length;
        int low=0,high=nums.length-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]>=target){
                ans=mid;
                  high=mid-1;
                
            }
            else{
              low=mid+1;
            }
        }

        return ans;
    }
     public int ub(int nums[],int target){
        int ans=nums.length;
        int low=0,high=nums.length-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]>target){
                ans=mid;
                  high=mid-1;
                
            }
            else{
              low=mid+1;
            }
        }

        return ans;
    }
}