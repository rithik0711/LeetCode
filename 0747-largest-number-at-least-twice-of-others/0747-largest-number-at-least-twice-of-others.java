class Solution {
    public int dominantIndex(int[] nums) {
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        int ind=-1;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num>largest){
                secondlargest=largest;
                largest=num;
                ind=i;
            }
            else if(num>secondlargest && num!=largest){
                secondlargest=num;
            }
        }
        if(largest>=secondlargest*2) return ind;
        return -1;
    }
}