package day_19;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a static method called transformedList. It should take a List of
 * Strings and a Function<String,String> and return a new List that contains the
 * results of applying the function to each element of the original list.
 *
 * @author Sam Jansen
 */
public class Exercise7 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] words = {"mary","possessed","a","little","lamb",
                "with","fleece","as","white","as","asbestos"};

        for (String word : words) {
            list.add(word);
        }

        System.out.println("Original string list: " + list.toString() + "\n");

        System.out.println("Making the list exciting!..");
        List<String> excitingWords = StringUtils.transformedList(list, s -> s + "!");
        System.out.println(excitingWords.toString() + "\n");

        System.out.println("Converting 'i' to 'eye'..");
        List<String> eyeWords = StringUtils.transformedList(list, s -> s.replace("i", "eye"));
        System.out.println(eyeWords.toString() + "\n");

        System.out.println("Making the list uppercase..");
        List<String> upperCaseWords = StringUtils.transformedList(list, String::toUpperCase);
        System.out.println(upperCaseWords.toString() + "\n");
    }
}
