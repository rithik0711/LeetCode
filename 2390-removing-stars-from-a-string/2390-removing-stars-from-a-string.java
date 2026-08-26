class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!='*')
                sb.append(ch);
            else if(ch=='*'){
                if(sb.length()>=1){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        return sb.toString();
    }
}