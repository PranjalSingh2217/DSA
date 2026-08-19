class Solution {
    public int maxProfit(int[] prices) {
        int buy=0;
        int current=1;
        int diff=0;
        for(int i=1;i<prices.length;i++){
            if(prices[buy]>=prices[current]){
                buy=current;
                current++;
            }
            else if(prices[current]>prices[buy]){
              int newDiff=prices[current]-prices[buy];
               if(newDiff>diff) diff=newDiff;   
               current++;
            }
      
        }
        return diff;
        
    }
}