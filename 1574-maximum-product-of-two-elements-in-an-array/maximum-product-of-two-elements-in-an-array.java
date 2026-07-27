class Solution {
    public int maxProduct(int[] nums) {
        int i =1;
        int j=2;
        int sum=0;
      
        for (i=0;i<nums.length;i++){
              for (j=i+1;j<nums.length;j++){
          int res =   (nums[i]-1)*(nums[j]-1);
         
          sum = Math.max(res,sum);
              }
        } return sum ;
    } 
}