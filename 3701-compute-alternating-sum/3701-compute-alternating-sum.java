class Solution {
    public int alternatingSum(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length-1;i+=2){
            res+=nums[i]-nums[i+1];
        }
        if(nums.length%2!=0)
            res+=nums[nums.length-1];
        return res;
    }
}