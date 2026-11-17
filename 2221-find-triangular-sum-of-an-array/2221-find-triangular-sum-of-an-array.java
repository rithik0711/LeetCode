class Solution {
    public int triangularSumArray(List<Integer> list){
        if(list.size()==1) return list.get(0);
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<list.size()-1;i++){
            int num = list.get(i)+list.get(i+1);
            if(num>=10)
                res.add(num%10);
            else res.add(num);
        }
        return triangularSumArray(res);
    }
    public int triangularSum(int[] nums) {
        if(nums.length==1) return nums[0];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        return triangularSumArray(list);
    }
}