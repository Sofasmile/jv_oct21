package l_14_java8_extra;

import java.util.Collections;
import java.util.List;

public class StreamTask1 {

    /**
     * Calculate the sum of Integers that are greater than 10;
     * @param list List of Integers
     * @return int sum
     */
    private static int sumStream(List<Integer> list) {
        return 0;
    }

    public static void main(String[] args) {
        test(sumStream(Collections.emptyList()), 0, "emptyList");
        test(sumStream(List.of(1)), 0, "singleElement");
        test(sumStream(List.of(15)), 15, "singleElement");
        test(sumStream(List.of(1, 2, 3, 4, 10, 12, 14)), 26, "usualCase");
        test(sumStream(List.of(-15, -4, -3, -2, -1)), 0, "negativeNumbers");
        test(sumStream(List.of(-4, -3, 10, 15, 17)), 32, "negativeAndPositiveNumbers");
    }

    private static void test(int actual, int expected, String testName) {
        if (actual != expected) {
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
