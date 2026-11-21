/*
Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.

 

Example 1:

Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

*/

class Solution {
    static boolean isValidAnser(int[] nums, int k, int maxSum) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] <= maxSum) {
                sum = sum + nums[i];
            } else {
                count++;
                if (count > k || nums[i] > maxSum) {
                    return false;
                } else {
                    sum = 0;
                    sum = sum + nums[i];
                }
            }
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int s = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        int e = sum;
        int ans = 0;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAnser(nums, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}