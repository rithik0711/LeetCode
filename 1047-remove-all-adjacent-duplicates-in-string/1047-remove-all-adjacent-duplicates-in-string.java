class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> s1 = new Stack<>();
        for(char ch:s.toCharArray()){
            if(!s1.isEmpty() && ch==s1.peek()){
                s1.pop();
            }
            else s1.push(ch);
        }
        StringBuilder res = new StringBuilder();
        while(!s1.isEmpty()){
            res.insert(0,s1.pop());
        }
        return res.toString();
    }
}