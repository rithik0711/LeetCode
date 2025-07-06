//Used bitCount to Count number of setbits in the integer
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res=0;
        for(int i=left;i<=right;i++){
            int count = Integer.bitCount(i);
            if(isPrime(count)) res++;
        }
        return res;
    }
    public boolean isPrime(int num){
        if(num<2) return false;
        if(num==2) return true;
        if(num%2==0) return false;
        for(int i=3;i*i<=num;i+=2){
            if(num%i==0) return false;
        }
        return true;
    }
}
