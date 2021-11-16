package exam;

public class SumOfArray {
    /**
     * Отримати суму всіх чисел з масиву numbers.
     * На вхід отримуємо масив String в якому заховані тільки цілі числа
     *
     * @param numbers
     * @return sum of numbers
     */
    public static int getSumOfIntegers(String[] numbers) {
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.valueOf(number);
        }
        return sum;
    }

    public static void main(String[] args) {
        test(getSumOfIntegers(new String[]{}), 0, "EmptyArray");
        test(getSumOfIntegers(new String[]{"1", "2"}), 3, "PositiveNumbers");
        test(getSumOfIntegers(new String[]{"-1", "2", "0", "19"}), 20, "PositiveAndNegativeNumbers");
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