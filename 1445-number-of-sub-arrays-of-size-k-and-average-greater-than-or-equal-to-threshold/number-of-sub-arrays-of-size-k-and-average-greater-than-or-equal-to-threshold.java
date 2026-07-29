class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int window = 0;
        for (int i = 0; i < k; i++) {
            window = window + arr[i];

        }
        int count = 0;
        if (window / k >= threshold) {
            count = 1;
        }
        for (int i = k; i < arr.length; i++) {
            window += arr[i] - arr[i - k];
            // if (window / k >= threshold) {
            //   count++;
            // } else {
            //     continue;
            // }
            if (window >= threshold * k) {
                count++;
            }
        }
        return count;
    }
}