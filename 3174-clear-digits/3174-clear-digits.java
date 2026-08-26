class Solution {
    // public String UsingStack(String str, Stack<Character> stack){
    //     for(int i=0;i<str.length();i++){
    //         char ch = str.charAt(i);
    //         if(!Character.isDigit(ch))
    //             stack.push(ch);
    //         else
    //             stack.pop();
    //     }
    //     if(stack.isEmpty()) return "";
    //     String res = "", fin = "";
    //     int size=0;
    //     while(stack.size()>0){
    //         res+=stack.pop();
    //         size++;
    //     }
    //     for(int i=size-1;i>=0;i--){
    //         fin+=res.charAt(i);
    //     }
    //     return fin;
    // }
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                if(sb.length()>0)
                    sb.deleteCharAt(sb.length()-1);
            }
            else
                sb.append(ch);
        }
        return sb.toString();
    }
}