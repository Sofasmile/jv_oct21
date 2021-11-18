package l_13_java8_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamApiExample {
    public static void main(String[] args) {
        Person alisa = new Person();
        alisa.setAge(20);
        alisa.setName("Alisa");

        Address alisaAddress = new Address();
        alisaAddress.setCity("Kyiv");
        alisaAddress.setStreet("Shevchenka");
        alisaAddress.setOldStreetNames(List.of("Old name 1", "Old name 2"));

        alisa.setAddress(alisaAddress);

        Person bob = new Person();
        bob.setAge(42);
        bob.setName("Bob");

        Address bobAddress = new Address();
        bobAddress.setCity("Kyiv");
        bobAddress.setStreet("Sadova");
        bobAddress.setOldStreetNames(List.of("Old sadova 1", "Old sadova 2"));

        bob.setAddress(bobAddress);

        List<Person> people = new ArrayList<>();
        people.add(alisa);
        people.add(bob);

        // List all old street names for persons
        // who live in Kyiv +
        // and is younger than 25 +
        // and old street name contains "1"


        // map flatMap

        List<String[]> list = new ArrayList<>();
        list.add(new String[] {"hello", "avc"});
        list.add(new String[] {"hello", "avc"});
        list.add(new String[] {"hello", "avc"});

        Stream<String[]> stream = list.stream(); //  {"hello", "avc"},  {"hello", "avc", "123sss"},  {"hello", "avc"}
        Stream<String> newStream = stream.flatMap(a -> Arrays.stream(a)); // "hello", "avc", "" ....
        List<String> strings = newStream.collect(Collectors.toList());


    }
}







