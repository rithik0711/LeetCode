class Solution {
    public int scoreOfString(String s) {
        int num=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), s.charAt(i)-'a');
        }
        for(int i=0;i<s.length()-1;i++){
            num+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return num;
    }
}