class Solution {
    public void moveZeroes(int[] arr) {
        if(arr.length==1||arr.length==0) return;
        int left=0,right=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
              int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
            }
            right++;
        }
    }
}