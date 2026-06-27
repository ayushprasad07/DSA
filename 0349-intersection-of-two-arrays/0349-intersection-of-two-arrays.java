class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        List<Integer> list = new ArrayList<>();

        for (int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    if(list.contains(nums1[i])){
                        continue;
                    }
                    list.add(nums1[i]);
                }
            }
        }

        int k = list.size();
        int arr[] = new int[k];

        for(int i = 0;i<k;i++){
            arr[i] = list.get(i);
        }

        return arr;
    }
}