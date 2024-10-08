public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int fastPointer = 1;
        int slowPointer = 0;
        int profit = 0;
        int maxProfit = 0;

        while(fastPointer < prices.length){
            profit = prices[fastPointer] - prices[slowPointer];
            
            maxProfit = Math.max(profit, maxProfit);
            if(profit <= 0){
                slowPointer = fastPointer;
                fastPointer++;
            } else {
                fastPointer++;
            }
        }
        if(maxProfit <= 0) maxProfit = 0;
        return maxProfit;
    }
}
