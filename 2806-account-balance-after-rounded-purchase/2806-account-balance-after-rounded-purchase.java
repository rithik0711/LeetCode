class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount){
        return 100-(Math.round(((purchaseAmount + 5) / 10) * 10));
    }
}