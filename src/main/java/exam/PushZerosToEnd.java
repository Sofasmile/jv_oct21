package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PushZerosToEnd {
    /**
     * Given an array of random numbers.
     * Push all the zero’s of a given array to the end of the array.
     *
     * Example:
     *
     * Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
     * Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
     *
     * Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
     * Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
     * @param arr array in int numbers
     * @return the resulted array
     */
    public static int[] pushZerosToEnd(int arr[]) {
        // 1) ArrayList()
        // 2) new int []
        // 3) current int []
        int[] result = new int[arr.length];
        int index = 0;
        for (int number : arr) {
            if (number != 0) {
                result[index++] = number;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        test(pushZerosToEnd(new int[]{}), new int[]{}, "emptyArray");
        test(pushZerosToEnd(new int[]{0}), new int[]{0}, "singleZeroElement");
        test(pushZerosToEnd(new int[]{5}), new int[]{5}, "singleElement");
        test(pushZerosToEnd(new int[]{8, 9}), new int[]{8, 9}, "twoElements");
        test(pushZerosToEnd(new int[]{0, 0, 1, 0, 4}), new int[]{1, 4, 0, 0, 0}, "usualCase");
        test(pushZerosToEnd(new int[]{0, -100, 0, -50, 50, 0, -100, 0}), new int[]{-100, -50, 50, -100, 0, 0, 0, 0}, "negativeIntegers");
    }

    private static void test(int[] actual, int[] expected, String testName) {
        if (!Arrays.equals(actual, expected)) {
            String errorMessage = String.format(
                    "Test %s failed: %s is not equal to expected %s",
                    testName,
                    Arrays.toString(actual),
                    Arrays.toString(expected));
            System.out.println("ERROR: " + errorMessage);
        } else {
            System.out.println("SUCCESS: " + testName + " passed");
        }
    }
}
