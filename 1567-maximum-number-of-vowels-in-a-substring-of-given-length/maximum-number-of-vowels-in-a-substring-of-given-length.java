class Solution {
    public int maxVowels(String s, int k) {

        int window = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                window++;
            }
        }
        int max = window;
        for (int i = k; i < s.length(); i++) {

            if (isVowel(s.charAt(i))) {
                window++;
            }
            if (isVowel(s.charAt(i - k))) {
                window--;
            }
            max = Math.max(max, window);
        }
        return max;
    }
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u';
                    }
}