class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        System.out.print(set);
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int max=1;
        int count=1;
        for(int i=1;i<list.size();i++){
            int val=list.get(i-1);
            if(list.get(i)!=val+1){
                count=1;
            }
            else{
                count++;
                max=Math.max(max, count);
            }
        }
        return max;
    }
}