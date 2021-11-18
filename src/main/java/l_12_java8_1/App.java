package l_12_java8_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        int number = Integer.parseInt("123");
        Function<String, Integer> function = Integer::parseInt; // Class::static method


        String string = new String();
        Supplier<String> supplier = String::new; // Class::constructor
        String s = supplier.get();

        Conventor conventor = new Conventor();
        String name = conventor.convert(new User(12, "Ann"));
        Function<User, String> userFunction = conventor::convert; // object::non static method


        Function<User,Integer> ageFunction = User::getAge; // Class:: non static method
        List<Object> list = List.of("1", "2");
        List list1 = new ArrayList();
    }

}
