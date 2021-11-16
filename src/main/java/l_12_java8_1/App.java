package l_12_java8_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        // 1. generate 10 random users
        // 2. get all users over 10 years old from source data
        // 3. get all names from users
        // 4. sort
        String[] names = {"Bob", "Alice", "John"};
        Random random = new Random();

        Stream.generate(() -> new User(names[random.nextInt(names.length)]))
                .limit(10)
                .filter(user -> user.getName().equals("Alice"))
                .map(User::getName)
                .sorted()
                .forEach(System.out::println);
    }
}
