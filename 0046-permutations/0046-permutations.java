class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int map[] = new int [nums.length];

        per(new ArrayList<>(),map,nums);

        return result;
    }

    public void per(List<Integer> curr, int map[],int arr[]){
        if(curr.size()==map.length){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0;i<map.length;i++){
            if(map[i]!=1){
                curr.add(arr[i]);
                map[i] = 1;
                per(curr,map,arr);
                curr.remove(curr.size()-1);
                map[i] = 0;
            }
        }
    }
}