package day_20;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Turn the strings in the array words into uppercase, keep only the ones that are shorter than 4
 * characters, and, of what is remaining, keep only the ones that contain “E”, and print the first
 * result. Repeat the process, except checking for a “Q” instead of an “E”.
 *
 * @author Sam Jansen
 */
public class Exercise5 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("mary","and","joe","possessed","a","little","lamb",
                "with","fleece","as","white","as","asbestos","cue");

        System.out.println("Original list: " + words.toString());

        Optional<String> result = words.stream()
                                    .map(String::toUpperCase)
                                        .filter(n -> n.length() < 4)
                                            .filter(n -> n.contains("E"))
                                                .findFirst();
        System.out.print("First short word containing E: ");
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Nothing to print");
        }

        result = words.stream()
                    .map(String::toUpperCase)
                        .filter(n -> n.length() < 4)
                            .filter(n -> n.contains("Q"))
                                .findFirst();
        System.out.print("First short word containing Q: ");
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Nothing to print");
        }
    }
}
