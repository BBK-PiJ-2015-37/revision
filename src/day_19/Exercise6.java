package day_19;

import java.util.ArrayList;
import java.util.List;

/**
 * Rewrite allMatches so it works on any List and associated Predicate, not
 * just on Strings. Verify that your examples from the previous question still work.
 *
 * @author Sam Jansen
 */
public class Exercise6 {

    public static void main(String[] args) {
        //Starting with list of strings
        List<String> list1 = new ArrayList<>();
        String[] words = {"mary","possessed","a","little","lamb",
                "with","fleece","as","white","as","asbestos"};

        for (String word : words) {
            list1.add(word);
        }

        System.out.println("Original string list: " + list1.toString() + "\n");

        System.out.println("Getting only short words...");
        List<String> shortWords = ElementUtils.allMatches(list1,
                s -> s.length() < 4);
        System.out.println(shortWords.toString() + "\n");

        System.out.println("Getting only words containing 'b'...");
        List<String> wordsWithB = ElementUtils.allMatches(list1,
                s -> s.contains("b"));
        System.out.println(wordsWithB.toString() + "\n");

        System.out.println("Getting only words of even length...");
        List<String> evenLengthWords = ElementUtils.allMatches(list1,
                s -> (s.length() % 2) == 0);
        System.out.println(evenLengthWords.toString() + "\n");

        //Switching to list of integers
        List<Integer> list2 = new ArrayList<>();
        Integer[] ints = {3,8,34,673,234,127,45,12};

        for (Integer x : ints) {
            list2.add(x);
        }

        System.out.println("Original integer list: " + list2.toString() + "\n");

        System.out.println("Getting only small integers...");
        List<Integer> smallInts = ElementUtils.allMatches(list2, s -> s < 15);
        System.out.println(smallInts.toString() + "\n");

        System.out.println("Getting only odd integers...");
        List<Integer> oddInts = ElementUtils.allMatches(list2, s -> s % 2 != 0);
        System.out.println(oddInts.toString() + "\n");

        System.out.println("Getting only small and odd integers...");
        List<Integer> smallOddInts = ElementUtils.allMatches(list2, s -> s % 2 != 0 && s < 15);
        System.out.println(smallOddInts.toString() + "\n");

    }
}
