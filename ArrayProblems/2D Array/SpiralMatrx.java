import java.util.ArrayList;
import java.util.List;

public class SpiralMatrx {
    static List<Integer> printSpiralMatrix(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = m - 1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int col = startCol; col <= endCol; col++) {
                result.add(matrix[startRow][col]);
            }
            startRow++;
            for (int row = startRow; row <= endRow; row++) {
                result.add(matrix[row][endCol]);
            }
            endCol--;

            if (startRow <= endRow) {
                for (int col = endCol; col >= startCol; col--) {
                    result.add(matrix[endRow][col]);
                }
                endRow--;
            }

            if (startCol <= endCol) {
                for (int row = endRow; row >= startRow; row--) {
                    result.add(matrix[row][startCol]);
                }
                startCol++;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        List<Integer> res = printSpiralMatrix(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
