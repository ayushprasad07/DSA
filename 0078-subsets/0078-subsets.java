class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        sub(0, new ArrayList<>(),n,nums);

        return result;
    }

    public void sub(int idx, List<Integer> curr, int n, int nums[]){
        List<Integer> sb = new ArrayList<>();
        for(int x : curr){
            // if(sb.size()>0){
            //     sb.add(" ");
            // }
            sb.add(x);
        }

        result.add(sb);

        for(int i = idx;i<n;i++){
            curr.add(nums[i]);

            sub(i+1, curr, n,nums);

            curr.remove(curr.size() - 1);
        }
    }
}