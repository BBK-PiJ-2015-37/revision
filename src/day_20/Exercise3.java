package day_20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * For the following lists produce the same transformations using map:
 *
 *    • List<String> excitingWords =
 *       StringUtils.transformedList(words, s -> s + "!");
 *    • List<String> eyeWords =
 *       StringUtils.transformedList(words, s -> s.replace("i", "eye"));
 *    • List<String> upperCaseWords =
 *       StringUtils.transformedList(words, String::toUpperCase);
 *
 * @author Sam Jansen
 */
public class Exercise3 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("mary","possessed","a","little","lamb",
                "with","fleece","as","white","as","asbestos");

        System.out.println("Original list: " + words.toString());

        //Making words exciting
        List<String> excitingWords = words.stream()
                                        .map(n -> n + "!")
                                            .collect(Collectors.toList());
        System.out.println("Exciting list: " + excitingWords.toString());

        //Making eye words
        List<String> eyeWords = words.stream()
                                        .map(n -> n.replace("i", "eye"))
                                            .collect(Collectors.toList());
        System.out.println("Eye list: " + eyeWords.toString());

        //Making words uppercase
        List<String> upperCaseWords = words.stream()
                                            .map(String::toUpperCase)
                                                .collect(Collectors.toList());
        System.out.println("Uppercase list: " + upperCaseWords.toString());
    }
}
