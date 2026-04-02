class Solution {
    public boolean isVowel(char ch){
        char let =Character.toLowerCase(ch);
        if(let=='a' || let=='e'|| let=='i' || let=='o' || let=='u'){
            return true;
        }
        return false;
    }
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        int j=0;
        char[] let = s.toCharArray();
        for(int i=0;i<let.length;i++){
            if(isVowel(let[i])){
                let[i]=list.get(j++);
            }
        }
        return new String(let);
    }
}