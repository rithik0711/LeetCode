class Solution {
    public int[] MoveZeros(int[] nums){
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[ind++]=nums[i];
            }
        }
        for(int i=ind;i<nums.length;i++){
            nums[i]=0;
        }
        return nums;
    }
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        return MoveZeros(nums);
    }
}