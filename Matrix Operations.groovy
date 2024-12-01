// MatrixOperations.java (continued)
public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
    if (matrixA[0].length != matrixB.length) {
        throw new IllegalArgumentException("Matrix dimensions do not match for multiplication.");
    }
    int rows = matrixA.length, cols = matrixB[0].length, common = matrixB.length;
    int[][] result = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            for (int k = 0; k < common; k++) {
                result[i][j] += matrixA[i][k] * matrixB[k][j];
            }
        }
    }
    return result;
}