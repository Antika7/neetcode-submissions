class Solution {
    public int maxProfit(int[] prices) {

        int buy = 0;
        int sell = 0;
        int profit = 0;

        for(int i=0; i<prices.length; i++) {
            buy = prices[i];
            for(int j=i+1; j<prices.length; j++) {
                sell = prices[j];
                // System.out.println("Profit : " + profit +  " & Sell-Buy : " + (sell-buy));
                profit = (profit<(sell-buy)) ? (sell-buy) : profit;            
            }
        }

        if(profit<0) return 0;

        else return profit;
        
    }
}
