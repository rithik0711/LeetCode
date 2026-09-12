class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq = new int[10];
        int num=n;
        while(n>0){
            int digit = n%10;
            freq[digit]++;
            n/=10;
        }
        System.out.print(Arrays.toString(freq));
        int sum=0;
        for(int i=0;i<=9;i++){
            int ans;
            if(freq[i]!=0){
                ans=i*freq[i];
                sum+=ans;
            }
        }
        return sum;
    }
}