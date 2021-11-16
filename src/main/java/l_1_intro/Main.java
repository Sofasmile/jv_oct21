package l_1_intro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String [] arr = new String[3];
        for (String s : arr) {
            s = "abc";
        }
        System.out.println(Arrays.toString(arr));
    }

    public static boolean isAdult (int age) {
        return age >= 18;
    }

    public boolean isAdult1 (int age) {
        boolean result;
        if (age < 18) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    enum Day {
        WE
    }

}
