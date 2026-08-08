class Solution {
    public String longestPalindrome(String s) {
        String a = "";
        int i = 0;
        int j = s.length();
        for ( i = 0; i < j; i++) {
            String odd = expand(s, i, i);
            String even = expand(s, i, i + 1);
            if (odd.length() > a.length()) {
                a = odd;
            }
            if (even.length() > a.length()) {
                a = even;
            }
        }
        return a;
    }

    public String expand(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }

        return s.substring(i + 1, j);
    }
}