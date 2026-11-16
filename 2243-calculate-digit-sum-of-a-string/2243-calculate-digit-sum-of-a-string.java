import java.util.*;
class Solution {
    public int add(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                sum+=ch-'0';
            }
        }
        return sum;
    }
    public String CalculateDigitSum(String s, int k){
        if(s.length()<=k) return s;
        String res="";
        String str="";
        for(int i=0;i<s.length();i+=k){
            str = s.substring(i, Math.min(i+k, s.length()));
            int val =add(str);
            res+=val+"";
        }
        return CalculateDigitSum(res, k);
    }
    public String digitSum(String s, int k) {
        return CalculateDigitSum(s, k);
    }
}