class Solution {
    public int numOfStrings(String[] patterns, String word) {
        char[] char_arr = word.toCharArray();
        List<String> main_list = new ArrayList<>();
        for(int i=0;i<char_arr.length;i++){
            String str = "";
            for(int j=i;j<char_arr.length;j++){
                str+=char_arr[j];
                main_list.add(str);
            }
        }
        int count=0;
        for(int i=0;i<patterns.length;i++){
            for(int j=0;j<main_list.size();j++){
                if((patterns[i].equals(main_list.get(j))) && !patterns[i].equals('*')){
                    count+=1;
                    patterns[i]="*";
                }
            }
        }
        return count;
    }
}