class Solution {
    public int maxProfit(int[] arr) {
        int max=0,buyStock=arr[0],profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<buyStock){
               
                buyStock=arr[i];
            }
            else{
                profit=arr[i]-buyStock;
                max=Math.max(profit,max);
            }
        }
        return max;
    }
}