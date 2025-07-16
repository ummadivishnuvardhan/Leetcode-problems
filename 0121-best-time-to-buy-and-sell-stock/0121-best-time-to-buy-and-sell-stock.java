class Solution {
    public int maxProfit(int[] prices) {

        int buy_stock=prices[0];

        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy_stock){
                buy_stock=prices[i];
            }
            else{
                int cur=prices[i]-buy_stock;
                profit=Math.max(cur,profit);
            }
        }   
        return profit;     
    }
}