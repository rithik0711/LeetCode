class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] arr = new int[n+1];
        if(n==1&&trust.length==0) return n;
        if(n==2&&trust.length==0) return -1;
        for(int i=0;i<trust.length;i++){
            for(int j=0;j<trust[i].length;j++){
                if(j==0){
                    arr[trust[i][j]]--;
                }
                else if(j==1){
                    arr[trust[i][j]]++;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n-1) return i;
        }
        return -1;
    }
}