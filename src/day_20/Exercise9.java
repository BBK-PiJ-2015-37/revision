package day_20;

import java.util.Arrays;
import java.util.List;

/**
 * Produce a String that is all the words concatenated together, but with commas in between.
 * E.g., the result should be "hi,hello,...". Note that there is no comma at the beginning,
 * before “hi”, and also no comma at the end, after the last word.
 *
 * @author Sam Jansen
 */
public class Exercise9 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("mary","possessed","a","little","lamb",
                "with","fleece","as","white","as","asbestos");

        System.out.println("Original list: " + words.toString());

        String result = words.stream()
                            .reduce((a,b) -> a + "," + b)
                                .orElse("");
        System.out.println("Concatenated string with commas: " + result);
    }
}
