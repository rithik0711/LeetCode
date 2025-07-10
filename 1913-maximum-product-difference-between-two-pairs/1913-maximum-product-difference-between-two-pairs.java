class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int min_pro=nums[0]*nums[1];
        int max_pro=nums[nums.length-2]*nums[nums.length-1];
        return max_pro-min_pro;
    }
}
