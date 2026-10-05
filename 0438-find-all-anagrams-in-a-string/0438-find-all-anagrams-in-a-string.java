class Solution {
    public boolean contains(String s1, String s2){
        int[] freq = new int[26];
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            freq[ch-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0)
                return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length()-p.length()+1;i++){
            String str = s.substring(i, i+p.length());
            if(contains(str, p))
                list.add(i);
        }
        return list;
    }
}