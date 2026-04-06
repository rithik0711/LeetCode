class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int firstvalue = map.values().iterator().next();
        for(int value:map.values()){
            if(firstvalue!=value)
                return false;
        }
        return true;
    }
}