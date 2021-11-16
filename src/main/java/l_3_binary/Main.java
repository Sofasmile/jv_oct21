package l_3_binary;

public class Main {
    public static void main(String[] args) {
//        System.out.println(5 && 7); // логічний true/false
        System.out.println(8 << 1); // побітовий true/false | numbers
        System.out.println(8 >> 1); // побітовий true/false | numbers
        //000001000
        //
        Integer alicaAge = null;
        if (alicaAge != null && isAdult(alicaAge)) {
            System.out.println("You can drink alcohol");
        }

    }

    public static boolean isAdult(Integer age) {
        System.out.println("The method isAdult() was called");
        return age >= 18;
    }
}
