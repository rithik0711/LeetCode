class Solution {
    public String sort(String str){
        char[] ch = str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(ch[i]>ch[j]){
                    char temp = ch[j];
                    ch[j]=ch[i];
                    ch[i]=temp;
                }
            }
        }
        return new String(ch);
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            String word1 = sort(words[i]);
            for(int j=i;j<words.length;j++){
                String word2 = sort(words[j]);
                if(word1.equals(word2) && i!=j){
                    count++;
                }
            }
            
            
        }
        return count;
    }
}