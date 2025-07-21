class Solution {
    public String makeFancyString(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            int size=stack.size();
            if(size>=2 && stack.get(size-1)==ch && stack.get(size-2)==ch){
                continue;
            }
            stack.push(ch);
        }
        StringBuilder str=new StringBuilder();
        for(char ch:stack){
            str.append(ch);
        }
        return str.toString();
    }
}