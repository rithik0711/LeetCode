class Solution {
    public double minimumAverage(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Double> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        while(!list.isEmpty()){
            int min = Collections.min(list);
            int max = Collections.max(list);
            result.add((min+max)/2.0);
            list.remove((Integer) min);
            list.remove((Integer) max);
        }
        return Collections.min(result);
    }
}