package l_7_files;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        FileReaderService fileReader = new FileReaderService();
//        fileReader.readFromFile("test.txt");

        FileWriterService fileWriter = new FileWriterService();
        fileWriter.writeToFile("Hello world", "write.txt");

        boolean[] numbers = new boolean[5]; // [0][0][0][0][0]
        numbers[0] = true;


        for (boolean number : numbers) {
            System.out.println(number);
        }
        String b = "";
        b.contains("e");
        int a = 0;
        a +=10;
        System.out.println(a);
    }
}
