class Solution {
    public int compress(char[] chars) {
        int count=1;
        int ind=0;
        for(int i=1;i<=chars.length;i++){
            if(i<chars.length && chars[i]==chars[i-1]){
                count++;
            }
            else{
                chars[ind++]=chars[i-1];
                if(count>1){
                    for(char digit:String.valueOf(count).toCharArray()){
                        chars[ind++]=digit;
                    }
                }
                count=1;
            }
        }
        return ind;
    }
}