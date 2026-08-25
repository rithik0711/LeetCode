class Solution {
    public boolean isPalindrome(String str, int start, int end){
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public String SubString(String str, int s, int e){
        String string = "";
        for(int i=s;i<=e;i++){
            string+=str.charAt(i);
        }
        return string;
    }
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1) return "";
        else if(s.length()==1) return s;
        for(int i=s.length();i>=1;i--){
            for(int j=0;j<=s.length()-i;j++){
                int k=j+i-1;
                if(isPalindrome(s, j, k)){
                    return SubString(s, j, k);
                }
            }
        }
        return "";
    }
}