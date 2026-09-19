class Solution {
    public int sumOfOdd(int n){
        int sum=0;
        int val=1;
        while(n>0){
            val+=2;
            sum+=val;
            n--;
        }
        return sum;
    }
    public int sumOfEven(int n){
        int sum=0;
        int val=0;
        while(n>0){
            val+=2;
            sum+=val;
            n--;
        }
        return sum;
    }
    public int GCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int odd = sumOfOdd(n);
        int even = sumOfEven(n);
        System.out.print(odd+" "+even);
        return GCD(odd, even);
    }
}