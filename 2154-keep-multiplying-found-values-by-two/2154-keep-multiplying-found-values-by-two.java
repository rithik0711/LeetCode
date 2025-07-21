class Solution {
    public int findFinalValue(int[] nums, int original) {
        int i=0;
        while(i<nums.length){
            if(nums[i]==original){
                original=FinalValue(nums, nums[i],  original);
                i=0;
            }
            else{
                i++;
            }
        }
        return original;
    }
    public int FinalValue(int[] nums, int num, int original){
        // if(num==original){
        //     original+=num*2;
        //     return original;
        // }
        return original*2;
    }
}