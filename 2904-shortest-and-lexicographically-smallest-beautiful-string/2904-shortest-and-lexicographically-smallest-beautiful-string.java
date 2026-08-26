class Solution {
    public boolean CountOne(String s, int k){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count==k;
    }
    public String shortestBeautifulSubstring(String s, int k) {
        String res="";
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length()-i;j++){
                String sub = s.substring(j, j+i+1);
                if(CountOne(sub, k) && sub.length()<min){
                    min=sub.length();
                    res=sub;
                }
                else if (CountOne(sub, k) && sub.length() == min) {
                    if(res.equals("") || sub.compareTo(res) < 0) {
                        res = sub;
                    }
                }
            }
            if (!res.equals("")) {
                break; 
            }
        }
        return res;
    }
}