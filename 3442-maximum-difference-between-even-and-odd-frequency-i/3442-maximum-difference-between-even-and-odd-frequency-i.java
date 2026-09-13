class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        int maxOdd=Integer.MIN_VALUE;
        int minEven=Integer.MAX_VALUE;
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                if (freq[i] % 2 != 0) {
                    maxOdd = Math.max(maxOdd, freq[i]);
                } else {
                    minEven = Math.min(minEven, freq[i]);
                }
            }
        }
        return maxOdd-minEven;
    }
}