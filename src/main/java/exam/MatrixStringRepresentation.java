package exam;

public class MatrixStringRepresentation {
    /**
     * Реалізуйте метод getMatrixRepresentation(), який отримує на вхід матрицю розміром N x M і повертає її строковий вигляд
     *
     * Наприклад на вхід ви передаєте матрицю
     *
     * 10, 20, 30, -10
     * 13, 12, 11, -24
     * 0,  0,  0,  0
     *
     * В результаті виконання ви повинні повернути строку "10 20 30 -10 13 12 11 -24 0 0 0 0"
     *
     * @param matrix - the matrix
     * @return - matrix text representation
     */
    public static String getMatrixRepresentation(int [][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sb.append(matrix[i][j]).append(" ");
            }
        }
//        int index = sb.length() - 1;
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static void main(String[] args) {
//        test(getMatrixRepresentation(new int[][]{}), "", "EmptyArray");
//        test(getMatrixRepresentation(new int[][]{{3}}), "3", "SingleElement");
        test(getMatrixRepresentation(new int[][]{{10, 20, 30, -10}, {13, 12, 11, -24}, {0, 0, 0, 0}}), "10 20 30 -10 13 12 11 -24 0 0 0 0", "UsualCase");
    }


    private static void test(String actual, String expected, String testName) {
        if (!actual.equals(expected)) {
            String errorMessage = String.format(
                    "Test %s failed: %s is not equal to expected %s",
                    testName,
                    actual,
                    expected);
            System.out.println("ERROR: " + errorMessage);
        } else {
            System.out.println("SUCCESS: " + testName + " passed");
        }
    }
}
