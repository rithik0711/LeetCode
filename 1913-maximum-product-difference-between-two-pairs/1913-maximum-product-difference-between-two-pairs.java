class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        // for(int i=0;i,nums.length;i++){
            
        // }
        int min_pro=nums[0]*nums[1];
        int max_pro=nums[nums.length-2]*nums[nums.length-1];
        return max_pro-min_pro;
    }
}