class Solution {
    public int maxProfit(int[] prices) {
        int leastbuy = prices[0];
              int profit =0;
        for(int a=0; a<prices.length;a++){
            if(prices[a]<leastbuy){
                leastbuy=prices[a];
            }
            if(prices[a]-leastbuy>profit){
                profit =prices[a]-leastbuy; 
            }
        }
        return profit;
    }
}
