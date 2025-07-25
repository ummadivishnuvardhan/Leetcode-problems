class Solution {
    public int maxProfit(int[] prices) {
              int max=0,sum=0,temp=0;
        int left=0,right=1;
        while(right<prices.length){
            temp=max;
            if(prices[left]<prices[right]){
                 max+=prices[right]-prices[left];
                
                
                
               
            }
           left++;
            right++;
        }
        return max;
    }
}