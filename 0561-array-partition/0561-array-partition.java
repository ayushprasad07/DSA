class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        int min;
        int sum = 0;
        int arr[] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = nums[i];
        }  

        Arrays.sort(arr);

        for(int i = 0;i<n;i+=2){
            min = Math.min(arr[i],arr[i+1]);
            sum += min;
        }

        return sum;
    }
}