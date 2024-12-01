// MatrixOperations.java
public class MatrixOperations {
    public static int determinant(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("Matrix must be square.");
        }
        return calculateDeterminant(matrix);
    }

    private static int calculateDeterminant(int[][] matrix) {
        int n = matrix.length;
        if (n == 1) return matrix[0][0];
        if (n == 2) return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        
        int det = 0;
        for (int col = 0; col < n; col++) {
            int[][] subMatrix = getSubMatrix(matrix, 0, col);
            det += Math.pow(-1, col) * matrix[0][col] * calculateDeterminant(subMatrix);
        }
        return det;
    }

    private static int[][] getSubMatrix(int[][] matrix, int row, int col) {
        int n = matrix.length;
        int[][] subMatrix = new int[n - 1][n - 1];
        for (int i = 0, subI = 0; i < n; i++) {
            if (i == row) continue;
            for (int j = 0, subJ = 0; j < n; j++) {
                if (j == col) continue;
                subMatrix[subI][subJ++] = matrix[i][j];
            }
            subI++;
        }
        return subMatrix;
    }