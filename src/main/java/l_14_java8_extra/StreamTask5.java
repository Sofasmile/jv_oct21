package l_14_java8_extra;

import java.util.List;

public class StreamTask5 {

    /**
     * get all unique characters in the String
     * @param sourceString - the source string
     * @return - unique characters from sourceString
     */
    public static List<Character> getUniqueCharacters(String sourceString) {
        //write your code here
        return null;
    }

    public static void main(String[] args) {
        test(getUniqueCharacters("abcd"), List.of('a', 'b', 'c', 'd'), "allDifferent");
        test(getUniqueCharacters("a"), List.of('a'), "oneElement");
        test(getUniqueCharacters("aaaaa"), List.of('a'), "oneUniqueElement");
        test(getUniqueCharacters("ababababababababababa"), List.of('a', 'b'), "twoElements");
    }

    private static void test(List<Character> actual, List<Character>  expected, String testName) {
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
