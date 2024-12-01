// TestMatrixDeterminant.java
import org.junit.Assert;
import org.junit.Test;

public class TestMatrixDeterminant {
    @Test
    public void testDeterminant() {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{2, -1, 3}, {0, 4, -2}, {1, 2, 0}};
        Assert.assertEquals(-2, MatrixOperations.determinant(matrix1));
        Assert.assertEquals(20, MatrixOperations.determinant(matrix2));
    }
}