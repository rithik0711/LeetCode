class Solution {
    public int Reverse(int num){
        int rev=0;
        while(num>0){
            rev=(rev*10)+(num%10);
            num/=10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(Reverse(nums[i]));
        }
        return set.size();
    }
}