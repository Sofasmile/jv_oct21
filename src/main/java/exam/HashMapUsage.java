package exam;

import java.util.HashMap;
import java.util.Map;

public class HashMapUsage {
    /**
     * Дано мапу де в якості ключа виступає певний користувач, а в якості значення - розмір його заробітної плати (ЗП).
     * Обчислити середнє значення ЗП всіх користувачів вік яких рівний або більше ніж 20 років
     * Дані про користувача зберігаються в об'єкті типу String в наступному форматі: ім'я:вік.
     * Наприклад наступна строка "Alice:18" описує користувача з іменем ALice і віком 18 років.
     *
     * Задача: реалізувати метод `calculateAverageSalary(Map<String, Integer> data)`
     * Нехай хеш мапа що приходить на вхід в метод має наступний вміст:
     *  data.put("Alice:18", 600);
     *  data.put("John:18", 1900);
     *  data.put("Bill:20", 2000);
     *  data.put("Jack:27", 1200);
     *
     * результатом виконання методу буде (2000 + 1200) / 2 = 1600
     * тому що враховуються значення заробітних плат тільки користувачів Bill та Jack
     *
     * Якщо мапа пуста - повернути 0
     * Якщо не знайдено користувачів вік яких рівний або більше ніж 20 років - повернути 0
     *
     * @param data    - HashMap with some data
     * @return average salary for filtered users
     */
    public static int calculateAverageSalary(Map<String, Integer> data) {
        int sum = 0;
        int count = 0;
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            String[] nameAndAge = entry.getKey().split(":");
            int age = Integer.valueOf(nameAndAge[1]);
            if (age >= 20) {
                sum += entry.getValue();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public static void main(String[] args) {
        test(calculateAverageSalary(new HashMap<>()), 0, "emptyHashMap");
        test(calculateAverageSalary(Map.of(
                "Alice:18", 600,
                "John:18", 1900,
                "Bill:20", 2000
                )), 2000, "oneUserHasAge20");
        test(calculateAverageSalary(Map.of(
                "Alice:18", 600,
                "John:18", 1900,
                "Bill:10", 2000)), 0, "allUsersAgeAreLessThan20");
        test(calculateAverageSalary(Map.of(
                "Alice:22", 1600,
                "John:27", 1900,
                "Ivan:27", 1500,
                "Jack:27", 1500,
                "Bill:28", 2500)), 1800, "allUsersAgeAreGreaterThan20");
        test(calculateAverageSalary(Map.of(
                "Alice:17", 1600,
                "John:19", 1900,
                "Ivan:27", 1500,
                "George:27", 1500,
                "Jack:16", 1500,
                "Bill:28", 1200)), 1400, "usualCase");
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
