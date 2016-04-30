package day_19;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a static method called allMatches. It should take a List of Strings
 * and a Predicate<String>, and return a new List of all the values that passed the
 * test. Test it with several examples.
 *
 * @author Sam Jansen
 */
public class Exercise5 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] words = {"mary","possessed","a","little","lamb",
                "with","fleece","as","white","as","asbestos"};

        for (String word : words) {
            list.add(word);
        }

        System.out.println("Original list: " + list.toString() + "\n");

        System.out.println("Getting only short words...");
        List<String> shortWords = StringUtils.allMatches(list,
                s -> s.length() < 4);
        System.out.println(shortWords.toString() + "\n");

        System.out.println("Getting only words containing 'b'...");
        List<String> wordsWithB = StringUtils.allMatches(list,
                s -> s.contains("b"));
        System.out.println(wordsWithB.toString() + "\n");

        System.out.println("Getting only words of even length...");
        List<String> evenLengthWords = StringUtils.allMatches(list,
                s -> (s.length() % 2) == 0);
        System.out.println(evenLengthWords.toString() + "\n");

    }
}
