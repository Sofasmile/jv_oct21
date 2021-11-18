package l_12_java8_1;

interface B {
   void write();

   default void print() {
      System.out.println("Hello mates");
   }
}