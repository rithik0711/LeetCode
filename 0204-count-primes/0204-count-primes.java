class Solution {
    static int Prime(boolean[] arr, int num){
        // if(num==0) return 0;
        arr[0]=false;
        arr[1]=false;
        int count=0;
        for(int i=2;i*i<=num;i++){
            if(arr[i]){
                for(int j=i*i;j<=num;j+=i){
                    arr[j]=false;
                }
            }
        }
        for(int i=0;i<num;i++){
            if(arr[i]) count++;
        }
        return count;
    }
    public static int countPrimes(int num){
        boolean[] array = new boolean[num+2];
	    Arrays.fill(array,true);
	    int result= Prime(array, num);
	    return result;
    }
}