class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length;j++){
                if(((nums[i]-1)*(nums[j]-1)>max) && i!=j){
                    max=(nums[i]-1)*(nums[j]-1);
                }
            } 
        }
        return max;
    }
}