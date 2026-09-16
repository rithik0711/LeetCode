class Solution {
    public int isVowel(String s){
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int count=0;
        for(char ch:s.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    }
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        String str1 = s.substring(0, mid);
        String str2 = s.substring(mid);
        int count1 = isVowel(str1);
        int count2 = isVowel(str2);
        return count1==count2;
    }
}