/*
Given a sorted array arr[] and a number target, find the upper bound of the target in this given array. The upper bound of a number is defined as the smallest index in the sorted array where the element is greater than the given number.
If all the elements in the given array are smaller than or equal to the target, the upper bound will be the length of the array.
Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 9
Output: 3
Explanation: 3 is the smallest index in arr[] at which element (arr[3] = 10) is larger than 9.
Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 11
Output: 6
Explanation: 6 is the smallest index in arr[] at which element (arr[6] = 25) is larger than 11.
*/
//O(logn)
public class BinaryUpperBound {

    static int getUpperBound(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= target) {
                s = mid + 1;
            } else {
                ans = mid;
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        int ans = getUpperBound(arr, 55);
        System.out.println(ans);
    }
}
