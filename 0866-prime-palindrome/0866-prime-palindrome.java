class Solution {
    public int primePalindrome(int n) {
        if (n <= 2) return 2;
        if (n <= 3) return 3;
        if (n <= 5) return 5;
        if (n <= 7) return 7;
        if (n <= 11) return 11;

        // Generate only odd-length palindromes
        for (int len = 1; len < 6; len++) {
            for (int root = (int)Math.pow(10, len - 1); root < (int)Math.pow(10, len); root++) {
                String s = Integer.toString(root);
                String rev = new StringBuilder(s.substring(0, s.length() - 1)).reverse().toString();
                int palindrome = Integer.parseInt(s + rev);
                if (palindrome >= n && isPrime(palindrome)) {
                    return palindrome;
                }
            }
        }

        return -1;
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
