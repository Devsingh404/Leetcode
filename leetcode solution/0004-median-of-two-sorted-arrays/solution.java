class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int len = n+m;

        int[] arr = new int[len];

        int i=0 ;
        int j=0 ;
        int k=0 ;

        while(i<n && j<m){
            if(nums1[i] <= nums2[j]){
                arr[k] = nums1[i];
                i++;
                k++;
            }else{
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i<n){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k] = nums2[j];
            j++;
            k++;
        }

        if(len == 0) return 0;
        if(len == 1) return arr[0];
        

        int first = arr[len/2 - 1];
        int second = arr[len/2];

        if(len%2 == 0) return (first + second) / 2.0;
        else return second;
    }
}
