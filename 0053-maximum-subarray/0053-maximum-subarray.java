class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0], curr_sum=nums[0];
        for(int i=1;i<nums.length;i++){
            curr_sum = Math.max(nums[i], curr_sum+nums[i]);
            sum=Math.max(curr_sum, sum);
        }
        return sum;
    }
}