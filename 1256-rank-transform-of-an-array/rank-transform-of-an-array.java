class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] arr1 = arr.clone();
        Arrays.sort(arr1);

        HashMap<Integer, Integer> rank = new HashMap<>();
        int currentRank = 1;

        for (int num : arr1) {
            if (!rank.containsKey(num)) {
                rank.put(num, currentRank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rank.get(arr[i]);
        }

        return arr;
    }
}