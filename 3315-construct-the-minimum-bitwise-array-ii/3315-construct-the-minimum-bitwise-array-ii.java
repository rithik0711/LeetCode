class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] arr = new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int num = nums.get(i);
            if(num%2==0) arr[i] = -1;
            else{
                int bit = (num+1) & -(num+1);
                int shift = bit >> 1;
                arr[i] = num ^ shift;
            }
        }
        return arr;
    }
}