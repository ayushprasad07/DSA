class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n = candidates.length;

        Arrays.sort(candidates);

        comb(0,target,new ArrayList<>(), n, candidates);

        // List<List<Integer>> newResult = new ArrayList<>(result);

        return result;
    }

    public void comb(int idx, int target, List<Integer> curr, int n, int arr[]){
            if (target==0){
                result.add(new ArrayList<>(curr));
                return;
            }

        for(int i = idx;i<n;i++){
            if(i >idx && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;

            curr.add(arr[i]);
            comb(i+1,target-arr[i],curr,n,arr);
            curr.remove(curr.size()-1);
        }
    }
}