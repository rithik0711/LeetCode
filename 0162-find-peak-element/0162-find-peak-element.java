class Solution {
    public int findPeakElement(int[] nums) {
        int max=nums[0],ind=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            if(nums[i]==max) ind=i;
        }
        return ind;
    }
}