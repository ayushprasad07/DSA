class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combination(0,target,new ArrayList<>(),candidates);
        return result;
    }

    public void combination(int idx, int target, List<Integer> curr, int arr[]){
        int n = arr.length;

        if(idx==n){
            if(target == 0)
                result.add(new ArrayList<>(curr));
            return;
        }

        if(arr[idx]<=target){
            curr.add(arr[idx]);
            combination(idx , target- arr[idx],curr, arr );
            curr.remove(curr.size()-1);
        }
        combination(idx+1, target, curr,arr);
    }
}