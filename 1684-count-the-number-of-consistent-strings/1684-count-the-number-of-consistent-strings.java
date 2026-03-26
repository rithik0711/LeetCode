class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=words.length;
        List<Character> list = new ArrayList<>();
        for(char ch:allowed.toCharArray()){
            list.add(ch);
        }
        for(String str:words){
            for(int i=0;i<str.length();i++){
                if(!list.contains(str.charAt(i))){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}