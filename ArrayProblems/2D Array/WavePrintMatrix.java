/*Given a 2D matrix, return it's elements in a WAVE order 
 this means atarting from the top most row and printing elements down in one column, 
 then moving to the next column and printing them up,
 and continuing this zig-zag pattern until all columns are processed
 */
//O(m*n)

import java.util.ArrayList;
import java.util.List;

public class WavePrintMatrix {

    static List<Integer> wavePrintMatrix(int[][] matrix, int m, int n) {
        List<Integer> wave = new ArrayList<>();
        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < m; row++) {
                    wave.add(matrix[row][col]);
                }
            } else {
                for (int row = m - 1; row >= 0; row--) {
                    wave.add(matrix[row][col]);
                }
            }
        }
        return wave;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int row = arr.length;
        int col = arr[0].length;
        List<Integer> res = wavePrintMatrix(arr, row, col);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
