class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum=0,start=0,maxSum=0;
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[start]);
                sum-=nums[start];
                start++;
            }
            set.add(nums[i]);
            sum+=nums[i];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}