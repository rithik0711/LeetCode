class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int size = nums.size();
        int[] arr = new int[size];
        for(int i=0;i<nums.size();i++){
            int n=nums.get(i);
            if(n%2==0){
                arr[i] = -1;
            }
            else{
                int bin = (n+1) & -(n+1);
                int shift = bin >> 1;
                arr[i] = n ^ shift;
            }
        }
        return arr;
    }
}