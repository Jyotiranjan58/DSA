public class TransposeOfMatrix {

    static int[][] transposeMatrix(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int[][] res = transposeMatrix(arr);
        for (int row = 0; row < res.length; row++) {
            for (int col = 0; col < res[0].length; col++) {
                System.out.print(res[row][col] + " ");
            }
            System.out.println();
        }

    }
}
