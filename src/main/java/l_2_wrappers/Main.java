package l_2_wrappers;

public class Main {
    public static void main(String[] args) {
        String s1 = "abc"; // [@1]
        String s2 = "abc"; // [@1]
        String s3 = new String("abc"); // [@2]
        String s4 = "ab" + "c"; // [@1]
        String s5 = s3.intern(); // [@1]
        System.out.println("1. s1 == s2 " + (s1 == s2));
        System.out.println("2. s1 == s3 " + (s1 == s3));
        System.out.println("3. s1 == s4 " + (s1 == s4));
        System.out.println("4. s2 == s3 " + (s2 == s3));
        System.out.println("5. s2 == s4 " + (s2 == s4));
        System.out.println("6. s3 == s4 " + (s3 == s4));
        System.out.println("7. s3 == s5 " + (s3 == s5));
        System.out.println("8. s1 == s5 " + (s1 == s5));
    }
}
