//package l_11_junit;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class ReverseServiceTest {
//    public String convertAndModifyNumbers(List<Integer> numbers) {
//        return numbers.stream()
//                .map(Integer::toBinaryString)
//                .collect(Collectors.joining(")" + System.lineSeparator() + "(", "(", ")"));
//    }
//    private static ReverseService reverseService;
//
//    @BeforeAll //BeforeAll    4 - Before 5 -BeforeEach
//    public static void setUp() {
//        reverseService = new ReverseService();
//    }
//
//    @Test
//    public void reverse_emptyString_ok() {
//        String expected = "";
//        String actual = reverseService.reverse("");
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void reverse_singleCharacterString_ok() {
//        String expected = "a";
//        String actual = reverseService.reverse("a");
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void reverse_validString_ok() {
//        String expected = "cba";
//        String actual = reverseService.reverse("abc");
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void reverse_nullString_notOk() {
//        Assertions.assertThrows(NullPointerException.class,
//                () -> reverseService.reverse(null));
//    }
//}
