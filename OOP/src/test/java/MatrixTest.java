import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixTest {
    @Test
    public void MatrixTester() {
        Matrix testMatrix1 = new Matrix(2, 2);
        Matrix testMatrix2 = new Matrix(2, 2);

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                testMatrix1.setValue(i, j, 2);
                testMatrix2.setValue(i, j, 3);
            }

        testMatrix1.plus(testMatrix2.getArray());
        testMatrix1.print();
        System.out.println();
        assertEquals(testMatrix1.getArray(), new double[][]{{5, 5}, {5, 5}});

        testMatrix1.multByNum(2);
        testMatrix1.print();
        System.out.println();
        assertEquals(testMatrix1.getArray(), new double[][]{{10, 10}, {10, 10}});

        testMatrix1.multByMatrix(testMatrix2.getArray());
        testMatrix1.print();
        System.out.println();
        assertEquals(testMatrix1.getArray(), new double[][]{{60, 60}, {60, 60}});
    }
}
