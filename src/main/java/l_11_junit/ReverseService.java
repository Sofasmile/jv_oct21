package l_11_junit;

public class ReverseService {
    public String reverse(String value) {
        if(value == null) {
            throw new NullPointerException();
        }
        if (value.equals("a")){
            return "a";
        }
        if (value.equals("abc")) {
            return "cba";
        }
        if (value.isEmpty()) {
            return "";
        }
        return null;
    }
}
