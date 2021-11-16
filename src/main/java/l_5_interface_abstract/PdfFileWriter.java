package l_5_interface_abstract;

public class PdfFileWriter implements Writer {
    @Override
    public void write() {
        System.out.println("Text was written to .pdf file");
    }
}
