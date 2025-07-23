class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1,result=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                count++;
            }
            else{
                result=Math.max(count,result);
                count=1;
            }
        }
        return Math.max(count,result);
    }
}