package l_7_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterService {
    public void writeToFile(String content, String fileName) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(content);
            fileWriter.flush();
            fileWriter.write(content);
        } catch (IOException exception) {
            throw new RuntimeException("Can't open file", exception);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException("Can't close file", e);
            }
        }
    }
}
