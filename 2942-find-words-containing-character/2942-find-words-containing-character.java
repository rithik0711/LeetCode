class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        Set<Character> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int i=0;
        for(String word:words){
            set.clear();
            for(char ch:word.toCharArray()){
                set.add(ch);
            }
            if(set.contains(x)){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}