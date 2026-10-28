class Solution{
  public int maxprofit(int[] prices){
    int minPrice=prices[0];
    int maxProfit=0;

      for(int i=0;i<prices.length;i++){
          int profit=prices[i]-minPrice;
          maxProfit=Math.max(maxProfit,profit);
     }
  return maxProfit;
  }
}
