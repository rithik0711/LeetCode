class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int max=0;
        while(i<j){
            int curr_max=nums[i]+nums[j];
            if(curr_max>max)
                max=curr_max;
            i++;
            j--;
        }
        return max;
    }
}