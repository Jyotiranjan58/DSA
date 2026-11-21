/*

PAINTER'S PARTITION PROBLEM

Given an array boards of length N where boards[i] represents the length of the i-th board, and K painters available to paint them:
• Each painter takes 1 unit of time to paint 1 unit of board.
• A painter can only paint contiguous sections of boards.
• Find the minimum time required to get all boards painted.
Example:
• Input: boards = [10, 20, 30, 40], K = 2
• Output: 60
• Explanation: Painter 1 paints [10, 20, 30] (60 units of time) and Painter 2 paints [40] (40 units of time). The total time taken is max(60, 40) = 60.

*/

public class Painter_Partition_Problem {

    static boolean isValidAnswer(int[] boards, int k, int maxLength) {

        int painter = 1;
        int length = 0;

        for (int i = 0; i < boards.length; i++) {
            if (length + boards[i] <= maxLength) {
                length = length + boards[i];
            } else {
                painter++;
                length = 0;
                if (painter > k || boards[i] > maxLength) {
                    return false;
                } else {

                    length = length + boards[i];
                }
            }
        }
        return true;

    }

    static int minTime(int[] boards, int k) {
        int n = boards.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + boards[i];
        }
        int s = 0;
        int e = sum;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAnswer(boards, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        System.out.println(minTime(arr, 2));
    }
}
