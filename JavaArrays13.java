public class JavaArrays13{
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit= Math.max(profit, maxProfit);
            }
            else{
                buyPrice = prices[i];
            }
        }return maxProfit;
    }
    public static void main(String[] args){
        int prices[]= {4,3,6,2,1,9};
        System.out.println("The max profit is " + buyAndSellStocks(prices));
    }
} 
