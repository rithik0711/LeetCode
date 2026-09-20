class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int val = ('z'-ch)+1;
            int ind = i+1;
            sum+=(val*ind);
        }
        return sum;
    }
}