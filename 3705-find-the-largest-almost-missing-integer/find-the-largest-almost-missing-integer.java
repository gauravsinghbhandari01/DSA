class Solution {
    public int largestInteger(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length - k; i++) {
            HashSet<Integer> Set = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                Set.add(nums[j]);
            }
            for (int num : Set) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int ans = -1;
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {

                ans = Math.max(ans, num);
            }

        }
        return ans;
    }
}