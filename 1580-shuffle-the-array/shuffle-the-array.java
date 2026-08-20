class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []arr = new int[2*n];
        int k=0;
        for(int i=0;i<n;i++){
            for( int j=n;j<nums.length;j++)  {
                 if (j == i + n) {                                                                        arr[k++] = nums[i];    
                    arr[k++] = nums[j];    
                }
            }
        }
        return arr;
               
    }
}