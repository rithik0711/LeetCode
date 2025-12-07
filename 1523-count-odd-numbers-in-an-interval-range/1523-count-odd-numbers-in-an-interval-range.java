class Solution {
    public int countOdds(int low, int high) {
        int num=high-low;
        if((num+1)%2==0) return (num/2)+1;
        else if((num+1)%2!=0&&low%2!=0&&high%2!=0){
            return (num/2)+1;
        }
        else if((num+1)%2!=0){
            return (num/2);
        }
        return 1;
    }
}