class Solution {
    public String smallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder left = new StringBuilder();
        StringBuilder mid = new StringBuilder();

        for (int i = 0; i < arr.length;) {
            char ch = arr[i];

            int count = 0;

           

            while (i < arr.length && arr[i] == ch) {

                count++;

                i++;

            }

           

            for (int j = 0; j < count / 2; j++) {

                left.append(ch);

            }

            

            if (count % 2 == 1) {

                mid.append(ch);

            }

        }

        String right = new StringBuilder(left).reverse().toString();

        return left.toString() + mid.toString() + right;

    }

}
