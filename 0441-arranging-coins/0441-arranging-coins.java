class Solution {
    public int arrangeCoins(int n) {
        long start = 0, fin = 0;
        for (long i = 1; i <= n; i++) {
            start += i;
            if (start > n) return (int) (i - 1);
        }
        return 1;
    }
}
