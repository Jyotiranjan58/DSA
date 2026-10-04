
/*Print the Sum of Each Col in a 2D Array */
//O(m*n)
import java.util.ArrayList;
import java.util.List;

public class SumOfEachCol {

    static List<Integer> sumOfCols(int[][] nums) {
        List<Integer> sum = new ArrayList<>();
        for (int col = 0; col < nums[0].length; col++) {
            int res = 0;
            for (int row = 0; row < nums.length; row++) {
                res += nums[row][col];
            }
            sum.add(res);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 2, 3 }, { 4, 7 } };
        List<Integer> res = sumOfCols(arr);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
