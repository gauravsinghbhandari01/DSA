import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> pos = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            pos.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int ans = Integer.MAX_VALUE;
        for (List<Integer> idxs : pos.values()) {
            for (int i = 0; i + 2 < idxs.size(); i++) {
                ans = Math.min(ans, idxs.get(i + 2) - idxs.get(i));
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : 2 * ans;
    }
}