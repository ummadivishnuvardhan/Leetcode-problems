class Solution {
    public int majorityElement(int[] arr) {
        int c=1,maj=arr[0];
        for(int i=1;i<arr.length;i++){
            if(c==0){
                maj=arr[i];
                c++;
            } 
            else if(arr[i]==maj){
                c++;
            }
            else{
                c--;
            }
        }
        return maj;
    }
}