// TestMatrixMultiplication.java
import org.junit.Assert;
import org.junit.Test;

public class TestMatrixMultiplication {
    @Test
    public void testMultiply() {
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{5, 6}, {7, 8}};
        int[][] expected = {{19, 22}, {43, 50}};
        Assert.assertArrayEquals(expected, MatrixOperations.multiply(matrixA, matrixB));
    }
}