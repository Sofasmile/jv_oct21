package l_8_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>(1000);
//        list.add("a"); // 0
//        list.add("b"); // 1
//        list.add(1,"c"); // 2
//        list.add("d"); // 3


        int[] array = {1,2,3,4,5,6,7,8,9,10,0};
        int index = 4;
        int newElement = 100;
        // int[] newArray = {1,2,3,4,5,6,7,8,9,10,0};
        // int[] newArray = {1,2,3,5,6,7,8,9,10,10};
        // int[] newArray = {1,2,3,4, 100, 5,6,7,8,9,10};

        System.arraycopy(array, index, array, index - 1,
                array.length - index -1);
        System.out.println(Arrays.toString(array));
    }
}
