class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int set=-1;
        if(ruleKey.equals("type")) set=0;
        else if(ruleKey.equals("color")) set=1;
        else if(ruleKey.equals("name")) set=2;
        int count=0;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(set).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}