class Solution {
    public int countCommas(int n) {
        int result=0;
        int power=1000;
        for(int i=1;i<=5;i++){
            if(n<power) return result;
            result += Math.max(0, n-(power-1));
            power*=1000;
        }
        return result;
    }
}