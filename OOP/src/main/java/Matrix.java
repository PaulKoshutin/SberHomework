public class Matrix {
    private double[][] array;
    private int rows, columns;

    Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        array = new double[rows][columns];
    }

    public void setValue(int i, int j, int value) {
        array[i][j] = value;
    }

    public void plus(double[][] otherArray) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] += otherArray[i][j];
            }
        }
    }

    public void multByNum(double num) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] *= num;
            }
        }
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multByMatrix(double[][] otherArray) {
        double[][] finalMatrix = new double[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                for (int k = 0; k < columns; k++) {
                    finalMatrix[i][j] += array[i][k] * otherArray[k][j];
                }
        array = finalMatrix;
    }

    public double[][] getArray() {
        return array;
    }
}
