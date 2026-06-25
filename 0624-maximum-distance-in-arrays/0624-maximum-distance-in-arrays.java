class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int n = arrays.size();
        int currentMin = arrays.get(0).get(0);
        int currentMax = arrays.get(0).get(arrays.get(0).size()-1);
        int largestSeen = 0;
        int smallestSeen = 0;
        int answer = 0;

        for(int i = 1;i<n;i++){
            smallestSeen = arrays.get(i).get(0);
            largestSeen = arrays.get(i).get(arrays.get(i).size()-1);

            int firstLargest = Math.abs(currentMax - smallestSeen);
            int firstSmall = Math.abs(largestSeen - currentMin);

            answer = Math.max(answer, Math.max(firstLargest , firstSmall));

            currentMin = Math.min(currentMin, smallestSeen);
            currentMax = Math.max(currentMax , largestSeen);
        }

        return answer;
    }
}