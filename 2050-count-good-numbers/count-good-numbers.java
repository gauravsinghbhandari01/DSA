class Solution {
  static final long MOD = 1000000007L;
    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        long ans = (power(5, even) * power(4, odd)) % MOD;
        return (int) ans;
    }

    public long power(long base, long exp) {
        if (exp == 0) {
            return 1;
        }
        long half = power(base, exp / 2);
        if (exp % 2 == 0) {
            return (half * half) % MOD;
        }
        return (half * half % MOD * base) % MOD;
    }
}