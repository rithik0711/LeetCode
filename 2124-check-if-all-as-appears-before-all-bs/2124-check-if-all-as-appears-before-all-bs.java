class Solution {
    public boolean checkString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sort = new String(arr);
        if(s.equals(sort))
            return true;
        return false;
    }
}