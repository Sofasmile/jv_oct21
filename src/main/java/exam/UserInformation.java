package exam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserInformation {
    /**
     * The input parameter is a list (List<String>) with information about users 
     * and their year of birth as follows:
     *    "Alice : 2000"
     *    "Bob:  1998"
     *    "John :1997"
     *
     * Note: The number of spaces between name and year of birth can be any.
     *
     * You need to return the array with the years of birth of users. 
     * Years should be sorted in ascending order.
     * 
     * For example: the input data is List.of("Alice : 2000", "Bob:  1998", "John :1997").
     * The result should be: [1997, 1998, 2000].
     *
     * @param userData - input data about users
     * @return the array with the years of birth of users
     */
    public static int[] getBirthYears(List<String> userData) {
        int[] years = new int[userData.size()];
        for( int i = 0; i < userData.size(); i++) {
            String[] nameAndYear = userData.get(i).split("\\s*:\\s*");
            int year = Integer.parseInt(nameAndYear[1]);
            years[i] = year;
        }
        Arrays.sort(years);
        return years;
    }

    public static void main(String[] args) {
        test(getBirthYears(List.of("Alice  :2000", "Bob:1998", "John : 1995", "John : 1998")),
                new int[]{1995, 1998, 1998, 2000},
                "simpleListOfUsers");
        test(getBirthYears(new ArrayList<>()), new int[]{}, "emptyUserList");
        test(getBirthYears(List.of("Stephan : 1995")), new int[]{1995}, "singleUserInTheList");
        test(getBirthYears(List.of("Anna:1996", "Irina:1997", "Andre : 1999", "Inna :    2001")),
                new int[]{1996, 1997, 1999, 2001},
                "sortedUserList");
        test(getBirthYears(List.of("Bob:1998", "Anna:1998", "Alice : 1998")),
                new int[]{1998, 1998, 1998},
                "userListWithTheSameYear");
    }

    private static void test(int[] actual, int[] expected, String testName) {
        boolean isCorrect = true;
        if ((actual != null && expected != null && actual.length == expected.length)) {
            for (int i = 0; i < actual.length; i++) {
                if (actual[i] != expected[i]) {
                    isCorrect = false;
                    break;
                }
            }
        } else {
            isCorrect = false;
        }
        if(!isCorrect) {
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
