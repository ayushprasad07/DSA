class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        HashMap<Integer, Integer> set = new HashMap<>();

        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<m;i++){
            set.put(nums2[i], set.getOrDefault(nums2[i],0)+1);
        }

        for(int i = 0;i<n;i++){
            if(set.containsKey(nums1[i]) && set.get(nums1[i])>0){
                list.add(nums1[i]);
                set.put(nums1[i], set.get(nums1[i])-1);
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