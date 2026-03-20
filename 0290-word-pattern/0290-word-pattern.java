class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        // Step 1: Length check
        if (pattern.length() != words.length) {
            return false;
        }
        
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> usedWords = new HashSet<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String word = words[i];
            
            if (map.containsKey(p)) {
                // Check if mapping matches
                if (!map.get(p).equals(word)) {
                    return false;
                }
            } else {
                // Check if word already mapped
                if (usedWords.contains(word)) {
                    return false;
                }
                map.put(p, word);
                usedWords.add(word);
            }
        }
        
        return true;
    }
}