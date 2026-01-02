class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        
        int left=0,right=0;
        while(right<arr.length){
            if(arr[right]==' '){
                reverse(arr,left,right-1);
                left=right+1;
            }
            right++;
        }
        reverse(arr,left,right-1);
        return new String(arr);
    }

    public void reverse(char[] arr,int l,int r){
        while(l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}