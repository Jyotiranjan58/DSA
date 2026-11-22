/*

Magnetic Force Between Two Balls Leetcode 1552

In the universe Earth C-137, Rick discovered a special form of magnetic force between two balls if they are put in his new invented basket. Rick has n empty baskets, the ith basket is at position[i], Morty has m balls and needs to distribute the balls into the baskets such that the minimum magnetic force between any two balls is maximum.

Rick stated that magnetic force between two different balls at positions x and y is |x - y|.

Given the integer array position and the integer m. Return the required force.

Input: position = [1,2,3,4,7], m = 3
Output: 3
Explanation: Distributing the 3 balls into baskets 1, 4 and 7 will make the magnetic force between ball pairs [3, 3, 6]. The minimum magnetic force is 3. We cannot achieve a larger minimum magnetic force than 3.
*/

import java.util.*;

class Solution {
    static boolean isValidAnswer(int[] arr, int m, int mid) {
        int count = 1;
        int lastPosition = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastPosition >= mid) {
                count++;
                lastPosition = arr[i];
                if (count == m) {
                    return true;
                }
            }
        }
        return false;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int s = 0;
        int e = position[position.length - 1] - position[0];
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAnswer(position, m, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
}