class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int arr[] = new int[n+m];
        int len = m+n;
        double median = 0.0;

        for(int i =0;i<n;i++){
            arr[i] = nums1[i];
        }

        for(int i = n;i<n+m;i++){
            arr[i] = nums2[i-n];
        }

        Arrays.sort(arr);

        if(len%2!=0){
            median = arr[(len ) / 2];
        }else{
            median = (double) (arr[len / 2] + arr[(len / 2) - 1]) / 2;
        }
        
        return median;
    }
}