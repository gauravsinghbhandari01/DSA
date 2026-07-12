class Solution {
    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length]; /* This line does two things:
                                          
                                            1. Creates a new integer array.
                                            2. Makes its size equal to the size of nums. */

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}         


  

