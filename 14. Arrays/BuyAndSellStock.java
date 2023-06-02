public class BuyAndSellStock {

    public static int buy_sell_stock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(buyPrice < prices[i]){       // Profit
                int profit = prices[i] - buyPrice;  // Today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buy_sell_stock(prices));
    }
}
