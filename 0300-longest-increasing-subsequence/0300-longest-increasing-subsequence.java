class Solution {
    public int lengthOfLIS(int[] arr) {
        int num = arr.length;
        int[] dp = new int[num];
		Arrays.fill(dp, 1);
		int max = 1;
		for(int i=0;i<num;i++){
		    int count=0;
		    for(int j=0;j<i;j++){
		        if(arr[j]<arr[i]){
                    dp[i]=Math.max(dp[i], dp[j]+1);
		        }
		        max=Math.max(max, dp[i]);
		    }
		}
		return max;
    }
}