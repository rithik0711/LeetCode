class Solution {
    public int countHillValley(int[] nums) {
        int hill=0,valley=0;
        for(int i=1;i<nums.length-1;i++){
            int prev=i-1;
            if(nums[i]==nums[prev]) continue;
            while (prev >= 0 && nums[prev] == nums[i]) prev--;
            int next = i + 1;
            while (next < nums.length && nums[next] == nums[i]) next++;
            if(prev>=0 && next<nums.length){
                if(nums[i]>nums[prev]&&nums[i]>nums[next]){
                    hill++;
                }
                if(nums[i]<nums[prev]&&nums[i]<nums[next]){
                    valley++;
                }
            }
        }
        return hill+valley;
    }
}