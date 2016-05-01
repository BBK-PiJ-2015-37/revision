package day_20;

import java.util.Arrays;
import java.util.List;

/**
 * Repeat the previous problem, but without the two spaces in front. This is trivial if you use
 * the same approach as in (1), so the point here is to use a method reference.
 *
 * @author Sam Jansen
 */
public class Exercise2 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("mary","possessed","a","little","lamb",
                "with","fleece","as","white","as","asbestos");

        words.stream().forEach(System.out::println);
    }
}
