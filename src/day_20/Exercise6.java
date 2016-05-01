package day_20;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Exercise (5) uses lazy evaluation, but it is not easy to see that it is doing so. Make a
 * variation of the above example that proves that it is doing lazy evaluation. The simplest way
 * is to track which entries are turned into upper case.
 *
 * @author Sam Jansen
 */
public class Exercise6 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("mary","and","joe","possessed","a","little","lamb",
                "with","fleece","as","white","as","asbestos","cue");

        System.out.println("Original list: " + words.toString());

        Optional<String> result = words.stream()
                .map(String::toUpperCase)
                    .peek(n -> System.out.print(n + " "))
                        .filter(n -> n.length() < 4)
                            .filter(n -> n.contains("E"))
                                .findFirst();
        System.out.print("\n" + "First short word containing E: ");
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Nothing to print");
        }

        result = words.stream()
                .map(String::toUpperCase)
                    .peek(n -> System.out.print(n + " "))
                        .filter(n -> n.length() < 4)
                            .filter(n -> n.contains("Q"))
                                .findFirst();
        System.out.print("\n" + "First short word containing Q: ");
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Nothing to print");
        }
    }
}
