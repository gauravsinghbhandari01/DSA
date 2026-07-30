class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        int sum = 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            while (set.contains(nums[j])) {
                 sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
            set.add(nums[j]);
            sum += nums[j];
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}