/*Given a sorted array arr[] and a number target, find the lower bound of the target in this given array.

The lower bound of a number is defined as the smallest index in the sorted array where the element is greater than or equal to the target.
If all the elements in the given array are smaller than the target, the lower bound will be the length of the array.
Examples:

Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 9
Output: 3
Explanation: 3 is the smallest index in arr[] where element (arr[3] = 10) is greater than or equal to 9.

Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 11
Output: 4
 */
//O(log n)

public class BinaryLowerBound {
    static int getLowerBound(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 30, 30, 30, 30, 40, 50 };
        int ans = getLowerBound(arr, 35);
        System.out.println(ans);
    }
}
