package l_14_java8_extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamTask2 {
    /**
     * Return the list of person names with age greater than 30
     * @param persons - list of persons
     * @return list of names
     */
    public static List<String> getPersonNames(List<Person> persons) {
        return null;
    }

    public static void main(String[] args) {
        Person alisa = new Person(25, "Alisa");
        Person bob = new Person(35, "Bob");
        Person bill = new Person(40, "Bill");

        test(getPersonNames(Collections.emptyList()), new ArrayList<>(), "emptyList");
        test(getPersonNames(List.of(alisa)), new ArrayList<>(), "emptyFilteredResults");
        test(getPersonNames(List.of(alisa, bob, bill)), List.of("Bob", "Bill"), "usualCase");
    }

    private static void test(List<String> actual, List<String> expected, String testName) {
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

class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}