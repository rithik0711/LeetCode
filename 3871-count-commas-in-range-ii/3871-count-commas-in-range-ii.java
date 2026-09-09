class Solution {
    public long countCommas(long n) {
        long result=0;
        long power=1000;
        for(int i=1;i<=5;i++){
            if(n<power) return result;
            result += Math.max(0, n-(power-1));
            power*=1000;
        }
        return result;
    }
}