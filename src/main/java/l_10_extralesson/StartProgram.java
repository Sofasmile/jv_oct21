package l_10_extralesson;

public class StartProgram {
    public FileReader fileReader;

    public StartProgram(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public void start() {
        fileReader.read();
    }
}
