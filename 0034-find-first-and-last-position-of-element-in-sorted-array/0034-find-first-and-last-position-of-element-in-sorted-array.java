class Solution {
    public int[] searchRange(int[] arr, int tar) {
      int[] res={-1,-1};
     
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==tar){
                res[0]=mid;
                high=mid-1;
            }
            else if(tar<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==tar){
                res[1]=mid;
                low=mid+1;
            }
            else if(tar<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
}