package Lab18;


public class TestClass {
    public static void main(String[] args) {
        Integer[] integers = new Integer[10];
        integers[0] = 40; integers[1] = 75; integers[2] = 22; integers[3] = 84; integers[4] = 45;
        integers[5] = 13; integers[6] = 27; integers[7] = 11; integers[8] = 17; integers[9] = 88;
        Double od = 52.3;
        Number[][] matrix01 = new Integer[2][2];
        Number[][] matrix02 = new Double[2][2];
        Number[][] matrix00 = new Double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix01[i][j] = integers[i*2+j];
                matrix02[i][j] = od;
                matrix00[i][j] = 0.0;
            }
        }
        Matrix matrix1 = new Matrix(matrix01);
        Matrix matrix2 = new Matrix(matrix02);        Matrix matrix0 = new Matrix(matrix00);

        System.out.println("matrix0");
        System.out.println(matrix0);
        System.out.println("matrix1");
        System.out.println(matrix1);
        System.out.println("matrix2");
        System.out.println(matrix2);

        System.out.println("matrix1.multiply(matrix2)");
        System.out.println(matrix1.multiply(matrix2));
        System.out.println("matrix0.det()");
        System.out.println(matrix0.det());
    }
}