class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int opened=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(opened>0)
                    sb.append(ch);
                opened++;            
            }
            else if(ch==')'){
                opened--;
                if(opened>0)
                    sb.append(ch);
            }
        }
        return sb.toString();
    }
}