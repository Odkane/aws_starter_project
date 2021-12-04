import java.util.List;
import java.util.stream.Collectors;

public class testClass {

    public static void main(String[] args) {

        List<String> hello = List.of("stripe", "6TRF1z", "summer", "68c1ddef-456e-41b4-88e2-247884fe6311","GgF8Hb8");

        System.out.println(hello.stream().map(str -> str.toUpperCase()).collect(Collectors.joining("")));
    }

}