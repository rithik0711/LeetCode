class Solution {
    public int countKeyChanges(String s) {
        int count=0;
        String str = s.toLowerCase();
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                continue;
            }
            else{
                count++;
            }
        }
        return count;
    }
}