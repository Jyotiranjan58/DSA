/*
Leetcode 33. Search in Rotated Sorted Array

There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly left rotated at an 
unknown index k (1 <= k < nums.length) such that the resulting array 
is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, 
return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
*/

public class SearchInaRotatedSortedArr {

    static int pivotIndex(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;
        if (arr[s] < arr[e]) {
            return -1;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] <= arr[n - 1]) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int search(int[] arr, int target) {
        int pivotIndex = pivotIndex(arr);
        int n = arr.length;

        if (pivotIndex == -1) {
            int ans = binarySearch(arr, 0, n - 1, target);
            return ans;
        } else {
            // left array search
            int arr1Start = 0;
            int arr1End = pivotIndex;
            if (target >= arr[arr1Start] && target <= arr[arr1End]) {
                int ans = binarySearch(arr, arr1Start, arr1End, target);
                return ans;
            }

            // right array search
            int arr2Start = pivotIndex + 1;
            int arr2End = n - 1;
            if (target >= arr[arr2Start] && target <= arr[arr2End]) {
                int ans = binarySearch(arr, arr2Start, arr2End, target);
                return ans;
            }

        }
        return -1;

    }

    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 7, 8, 1, 2 };
        int target = 1;

        int ans = search(arr, target);
        System.out.println(ans);

    }
}
