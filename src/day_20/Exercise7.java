package day_20;

import java.util.Arrays;
import java.util.List;

/**
 * Produce a single String that is the result of concatenating the uppercase versions of all of the
 * Strings. E.g., the result should be "HIHELLO...". Use a single reduce operation, without
 * using map.
 *
 * @author Sam Jansen
 */
public class Exercise7 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("mary","possessed","a","little","lamb",
                "with","fleece","as","white","as","asbestos");

        System.out.println("Original list: " + words.toString());

        String result = words.stream()
                            .reduce("", (a,b) -> a.toUpperCase() + b.toUpperCase());
        System.out.println("Concatenated string in uppercase: " + result);
    }
}
