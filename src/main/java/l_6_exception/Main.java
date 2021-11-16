package l_6_exception;

public class Main {
    public static void main(String[] args) {
    }

    public static void service() {
        Integer age = 10;
        try {
            isAdult(age);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void isAdult(Integer age) throws MyException {
        if (age >= 18) {
            System.out.println("It is adult!!!");
        } else if (age == null) {
            throw new MyException("is null");
        } else {
            throw new MyException("Sorry you are child");
        }
    }
}
