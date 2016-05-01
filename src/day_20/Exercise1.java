package day_20;

import java.util.Arrays;
import java.util.List;

/**
 * Loop through the words and print each on a separate line, with two spaces in front of each word.
 *
 * @author Sam Jansen
 */
public class Exercise1 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("mary","possessed","a","little","lamb",
                "with","fleece","as","white","as","asbestos");

        words.stream().forEach(n -> System.out.println("  " + n));
    }
}
