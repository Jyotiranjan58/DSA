/*
Aggressive Cows Geeks for Geeks

Given an integer array arr[], which denotes the positions of stalls. All the positions are distinct. There are k aggressive cows.

Assign the cows to the stalls such that the minimum distance between any two cows is maximized.

Examples:

Input: arr[] = [1, 2, 4, 8, 9], k = 3
Output: 3
Explanation: The first cow can be placed at arr[0], the second at arr[2], and the third at arr[3]. The minimum distance between any two cows is 3 (between arr[0] and arr[2]), which is the maximum possible among all valid arrangements.
Input: arr[] = [10, 1, 2, 7, 5], k = 3
Output: 4
Explanation: The first cow can be placed at arr[0], the second at arr[1], and the third at arr[4]. In this arrangement, the minimum distance between any two cows is 4 (between arr[1] and arr[4]), which is the maximum possible among all valid arrangements.


*/

class Solution {

    static boolean isValidAnswer(int[] arr, int k, int maxValue) {
        int count = 1;
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            if (value + arr[i] <= maxValue) {
                value = value + arr[i];
            } else {
                count++;
                value = 0;
                if (count > k || arr[i] > maxValue) {
                    return false;
                } else {
                    value = value + arr[i];
                }
            }
        }
        return true;
    }

    public int minTime(int[] arr, int k) {
        // code here
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int s = 0;
        int e = sum;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAnswer(arr, k, mid)) {
                ans = mid;
                e = mid - 1;

            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}
