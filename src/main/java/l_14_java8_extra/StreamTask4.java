package l_14_java8_extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamTask4 {
    /**
     * Get each character at required position
     * <p>
     * For example:
     * strings = "Hello", position = 1, return 'e'
     * strings = "Hello", position = 10, return empty list
     * strings = ["Hello", "java", "WORLD"], position = 1, return ['a','e', 'o']
     *
     * @param strings  - list of strings
     * @param position - position of character
     * @return list of characters in lower case and SORTED in natural ordering
     */
    public static List<Character> getCharacterAtPosition(List<String> strings, int position) {
        return null;
    }

    public static void main(String[] args) {
        test(getCharacterAtPosition(Collections.emptyList(), 10), new ArrayList<>(), "emptyList");
        test(getCharacterAtPosition(List.of("Hello"), 1), List.of('e'), "oneElement");
        test(getCharacterAtPosition(List.of("Hello", "WORLD", "java"), 1), List.of('a', 'e', 'o'), "usualCase");
        test(getCharacterAtPosition(List.of("Hello"), 10), new ArrayList<>(), "positionOutOfRange");

        List<String> listWithNullValue = new ArrayList<>();
        listWithNullValue.add("Hello");
        listWithNullValue.add(null);
        listWithNullValue.add("java");
        test(getCharacterAtPosition(listWithNullValue, 1), List.of('a', 'e'), "withNullString");
    }

    private static void test(List<Character> actual, List<Character> expected, String testName) {
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
