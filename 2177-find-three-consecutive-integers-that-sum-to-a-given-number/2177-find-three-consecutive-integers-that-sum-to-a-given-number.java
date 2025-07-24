class Solution {
    public long[] sumOfThree(long num) {
        if ((num - 3) % 3 != 0) {
            return new long[0]; // Not divisible, so no such triplet
        }

        long x = (num - 3) / 3;
        return new long[] {x, x + 1, x + 2};
    }
}
