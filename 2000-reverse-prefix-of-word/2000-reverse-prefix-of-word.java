class Solution {
    public String Reverse(String s){
        String str = "";
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        return str;
    }
    public String reversePrefix(String word, char ch) {
        int ind=0;
        String str = "";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                str+=word.charAt(i);
                ind=i;
                break;
            }
            else if(word.charAt(i)!=ch && i==word.length()-1)
                return word;
            str+=word.charAt(i);
        }
        String s = Reverse(str);
        for(int i=ind+1;i<word.length();i++){
            s+=word.charAt(i);
        }
        return s;
    }
}