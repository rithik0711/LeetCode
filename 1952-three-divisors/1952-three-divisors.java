class Solution {
    public boolean isThree(int n) {
        int count=0;
        // Map<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==3) return true;
        return false;
    }
}