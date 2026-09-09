class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        sub(0, new ArrayList<>(),n,nums);

        return result;
    }

    public void sub(int idx, List<Integer> curr, int n, int nums[]){
        List<Integer> sb = new ArrayList<>();

        for(int x : curr){
            sb.add(x);
        }

        if(!result.contains(sb)){
            result.add(sb);
        }

        for(int i = idx;i<n;i++){
            curr.add(nums[i]);

            sub(i+1, curr, n,nums);

            curr.remove(curr.size() - 1);
        }
    }
}