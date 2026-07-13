class Solution {
    public int maxProfit(int[] prices) {

        int buy,sell;
        int l = 0;
        int r = 1;
        int profit = 0;
        // int ctr = 1;

        while(r<prices.length) {

            // System.out.println("\nIteration : " + ctr);

            if(prices[l]>prices[r]) {
                // System.out.println("buy>sell");
                l = r;
            }

            else if(prices[l]<prices[r]) {
                // System.out.println("buy<sell");
                profit = Math.max(profit, prices[r] - prices[l]);
            }

            r++;
            // ctr++;
            // System.out.println("Profit : " + profit);
        }

        return profit;
        
    }
}
