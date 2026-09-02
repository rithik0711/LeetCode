class Solution {
    public boolean oddArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) return false;
        }
        return true;
    }
    public boolean evenArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0) return false;
        }
        return true;
    }
    public boolean uniformArray(int[] nums1) {
        // int[] nums2 = new int[nums1.length];
        // for(int i=0;i<nums1.length-1;i++){
        //     nums2[i] = nums1[i]-nums1[i+1];
        // }
        // nums2[nums1.length-1]=nums1[nums1.length-1];
        // if(oddArray(nums2) || evenArray(nums2)) return true;
        // return false;
        return true;
    }
}