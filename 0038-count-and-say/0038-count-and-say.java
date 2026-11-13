class Solution {
    public String CountNumbers(String str, int num){
        if(num==1) return str;
        String s="";
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                String val = String.valueOf(count);
                s+=val;
                s+=str.charAt(i-1);
                count=1;
            }
        }
        s+=String.valueOf(count);
        s+=str.charAt(str.length()-1);
        return CountNumbers(s, num-1);
    }
    public String countAndSay(int n) {
        if(n==1) return "1";
        return CountNumbers("1",n);
    }
}