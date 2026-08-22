class Solution {
    public boolean checkDivisibility(int n) {
        String temp = String.valueOf(n);
        int sum = 0;
        int product = 1;
        for (int i = 0; i < temp.length(); i++) {
            int digits = temp.charAt(i) - '0';
           
            sum += digits;
            product *= digits;
        }
           if (sum == 0 ) {
            return false;
        }  return n % (sum + product) == 0;
    }
}