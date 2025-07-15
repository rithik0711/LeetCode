class Solution {
    public String getEncryptedString(String s, int k) {
        int i=0;
        char[] arr=new char[s.length()];
        for(char ch:s.toCharArray()){
            arr[i]=s.charAt((i+k)%s.length());
            i++;
        }
        String str = new String(arr);
        return str;
    }
}