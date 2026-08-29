class Solution {
    public int[] finalPrices(int[] prices) {
        int[] item = new int[prices.length];
        int[] discounts = new int[prices.length];
        for(int i=0;i<prices.length;i++){
            discounts[i]=prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    discounts[i]=Math.abs(prices[i]-prices[j]);
                    break;
                }
            }
        }
        return discounts;
    }
}
//[0, 1, 2, 3, 4] => i
//[1, 2, 3, 4, 5] => j
//[1, 2, 3, 4, 5]