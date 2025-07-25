class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (arr[0] == -1) {
                    arr[0] = i; // first occurrence
                }
                arr[1] = i; // keep updating to last occurrence
            }
        }
        
        return arr;
    }
}
