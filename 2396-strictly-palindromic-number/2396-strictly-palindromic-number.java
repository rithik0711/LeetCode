class Solution {
    public boolean isPalindrome(String str){
        char[] arr = str.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<n-1;i++){
            String str = "";
            int temp=n;
            while(temp>0){
                int digit=temp%i;
                str+=digit;
                temp/=i;
            }
            if(!isPalindrome(str)){
                return false;
            }
        }
        return true;
    }
}