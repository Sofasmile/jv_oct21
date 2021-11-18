package l_12_java8_1;

interface A {
    void write();

    void read();

    default void print() {
       System.out.println("Hello world");
    }

    static void test() {
        System.out.println("test");
    }
}