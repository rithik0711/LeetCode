class Solution {
    public int[] sortByBits(int[] arr) {
        int[] res = new int[arr.length];
        int k=0;
        Arrays.sort(arr);
        for(int j=0;j<=32;j++){
            for(int i=0;i<arr.length;i++){
                if(Integer.bitCount(arr[i])==j){
                    res[k++]=arr[i];
                }
            }
        }
        return res;
    }
}