package l_10_extralesson;

public class Application {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        try {
        } catch (Exception e) {
            throw new MyException("text", e);
        }
    }
}

class MyException extends RuntimeException {
    public MyException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
