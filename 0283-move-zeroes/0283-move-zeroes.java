class Solution {
    public void moveZeroes(int[] arr) {
        if(arr.length==1||arr.length==0) return;
        int left=0,right=0;
        while(right<arr.length){
            if(arr[right]!=0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
            }
            right++;
        }
       
    }
}

  