/*You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Example 2:

Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 
*/
//O(n^2)

public class RotateImage {
    static void rotateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        // transposing the matrix
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        // reversing the matrix to get final output
        for (int row = 0; row < m; row++) {
            int startCOl = 0;
            int endCol = n - 1;
            while (startCOl <= endCol) {
                int temp = matrix[row][startCOl];
                matrix[row][startCOl] = matrix[row][endCol];
                matrix[row][endCol] = temp;
                startCOl++;
                endCol--;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        rotateMatrix(arr);
    }
}
