class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int arr[] = new int [n];
        int sum[] = new int [n];
        int pSum = 0;

        for (int i=0;i<n;i++){
            if(nums[i]==0){
                arr[i] = -1;
            }else{
                arr[i] = 1;
            }
        }

        for(int i = 0;i<n;i++){
            if(i==0){
                sum[i] = arr[i];
            }else{
                sum[i] = sum[i-1]+arr[i];
            }
        }

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0;i<n;i++){
            if(!map.containsKey(sum[i])){
                map.put(sum[i], new ArrayList<>());
                map.get(sum[i]).add(i);
            }else{
                map.get(sum[i]).add(i);
            }
        }

        for(int i = 0;i<n;i++){
            if(sum[i]==0){
                pSum = Math.max(pSum,i+1);
            }
            List<Integer> list = new ArrayList<>();
            list = map.get(sum[i]);
            int first = list.get(0);
            int last = list.get(list.size()-1);

            pSum = Math.max(pSum, last-first);
        }

        return pSum;
    }
}