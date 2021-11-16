package l_6_exception;

public class MyException extends Exception {
    // unchecked -> extends RuntimeException
    // checked -> extends Exception

    public MyException(String message) {
        super(message);
    }
}
