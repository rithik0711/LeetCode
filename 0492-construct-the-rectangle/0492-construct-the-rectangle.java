class Solution {
    public int[] constructRectangle(int area) {
        int i=1;
        int j=area;
        int[] arr = new int[2];
        while(i>0 && j>0){
            int curr_area = i*j;
            if(i*j==area){
                arr[0]=i;
                arr[1]=j;
                i++;
                j--;
            }
            else if(curr_area<area)
                i++;
            else 
                j--;
            if(arr[0]>=arr[1]){
                return arr;
            }
        }
        return arr;
    }
}