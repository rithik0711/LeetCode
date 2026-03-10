class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res = new int[friends.length];
        int k=0;
        Set<Integer> set = new HashSet<>();
        for(int friend:friends){
            set.add(friend);
        }
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i]))
                res[k++]=order[i];
        }
        return res;
    }
}