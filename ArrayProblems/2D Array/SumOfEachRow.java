/*Print the Sum of Each Row in a 2D Array */
// O(m*n)

import java.util.*;

public class SumOfEachRow {

    static List<Integer> sumOfRows(int[][] nums) {
        List<Integer> sum = new ArrayList<>();
        for (int row = 0; row < nums.length; row++) {
            int res = 0;
            for (int col = 0; col < nums[0].length; col++) {
                res += nums[row][col];
            }
            sum.add(res);
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2 }, { 2, 3 }, { 4, 7 } };
        List<Integer> res = sumOfRows(arr);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}