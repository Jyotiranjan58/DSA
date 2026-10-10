/*
Given a sorted array arr[] and an integer target, find the number of occurrences of target in given array.

Examples:

Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
Output: 4
Explanation: 2 occurs 4 times in the given array.

Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
Output: 0
Explanation: 4 is not present in the given array.
*/
//O(log n)

public class NoOfOccurrence {

    static int getUpperBound(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int upper = n;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= target) {
                s = mid + 1;
            } else {
                upper = mid;
                e = mid - 1;
            }
        }
        return upper;
    }

    static int getLowerBound(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int lower = n;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= target) {
                lower = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return lower;
    }

    static int countFreq(int arr[], int target) {

        int upper = getUpperBound(arr, target);
        int lower = getLowerBound(arr, target);

        int ans = upper - lower;
        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 2, 2, 2, 3 };
        int count = countFreq(arr, 2);
        System.out.println(count);
    }
}