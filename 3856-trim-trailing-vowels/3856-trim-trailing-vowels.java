class Solution {
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;
        return false;
    }
    public String trimTrailingVowels(String s) {
        int i = s.length() - 1;
        while(i>=0 && isVowel(s.charAt(i))){
            i--;
        }
        return s.substring(0, i+1);
    }
}