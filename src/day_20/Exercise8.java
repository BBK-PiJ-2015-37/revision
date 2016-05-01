package day_20;

import java.util.Arrays;
import java.util.List;

/**
 * Produce the same String as above, but this time via a map operation that turns the words
 * into upper case, followed by a reduce operation that concatenates them.
 *
 * @author Sam Jansen
 */
public class Exercise8 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("mary","possessed","a","little","lamb",
                "with","fleece","as","white","as","asbestos");

        System.out.println("Original list: " + words.toString());

        String result = words.stream()
                            .map(String::toUpperCase)
                                .reduce("", String::concat);
        System.out.println("Concatenated string in uppercase: " + result);
    }
}
