package day_20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * For the following lists produce the same transformations using filter:
 *
 *    • List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
 *    • List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
 *    • List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
 *
 * @author Sam Jansen
 */
public class Exercise4 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("mary","possessed","a","little","lamb",
                "with","fleece","as","white","as","asbestos");

        System.out.println("Original list: " + words.toString());

        //filtering for short words
        List<String> shortWords = words.stream()
                                    .filter(n -> n.length() < 4)
                                        .collect(Collectors.toList());
        System.out.println("Short words only: " + shortWords.toString());

        //filtering for words containing b
        List<String> wordsWithB = words.stream()
                                    .filter(n -> n.contains("b"))
                                        .collect(Collectors.toList());
        System.out.println("Words with b only: " + wordsWithB.toString());

        //filtering for even length words
        List<String> evenLengthWords = words.stream()
                                            .filter(n -> n.length() % 2 == 0)
                                                .collect(Collectors.toList());
        System.out.println("Even length words only: " + evenLengthWords.toString());
    }
}
