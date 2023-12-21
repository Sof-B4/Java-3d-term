package Lab18;

public class Matrix<T extends Number> {
    private T[][] matrix;
    private int lengthy;
    private int lengthx;
    public Matrix(T[][] matrix) {
        this.matrix = matrix;
        lengthy = matrix.length;
        if (lengthy > 0)
            lengthx = matrix[0].length;
    }
    public void sum(Matrix matrix0, Matrix matrixr) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixr.matrix[i][j] = Calculator.sum(matrix0.matrix[i][j], matrix[i][j]);
            }
        }
    }
    public Matrix<T> multiply(Matrix<T> otherMatrix) {
        if (matrix[0].length != otherMatrix.matrix.length) {
            throw new IllegalArgumentException("Matrices have incompatible sizes");
        }
        T[][] result = (T[][]) new Number[matrix.length][otherMatrix.matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < otherMatrix.matrix[0].length; j++) {
                double sum = 0;
                for (int k = 0; k < matrix[0].length; k++) {
                    sum += matrix[i][k].doubleValue() * otherMatrix.matrix[k][j].doubleValue();
                }
                result[i][j] = (T) Double.valueOf(sum);
            }
        }
        return new Matrix<>(result);
    }
    public T det() {
        return Calculator.subtract(Calculator.multiply(matrix[0][0],matrix[1][1]),
                Calculator.multiply(matrix[0][1],matrix[1][0]));
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result += matrix[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }
}