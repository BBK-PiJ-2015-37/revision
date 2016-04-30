package day_19;

import java.util.ArrayList;
import java.util.List;

/**
 * Rewrite transformedList so it works with generic types. Verify that your
 * examples from the previous question still work.
 *
 * @author Sam Jansen
 */
public class Exercise8 {

    public static void main(String[] args) {
        //Starting with list of strings
        List<String> list = new ArrayList<>();
        String[] words = {"mary","possessed","a","little","lamb",
                "with","fleece","as","white","as","asbestos"};

        for (String word : words) {
            list.add(word);
        }

        System.out.println("Original string list: " + list.toString() + "\n");

        System.out.println("Making the list exciting!..");
        List<String> excitingWords = ElementUtils.transformedList(list, s -> s + "!");
        System.out.println(excitingWords.toString() + "\n");

        System.out.println("Converting 'i' to 'eye'..");
        List<String> eyeWords = ElementUtils.transformedList(list, s -> s.replace("i", "eye"));
        System.out.println(eyeWords.toString() + "\n");

        System.out.println("Making the list uppercase..");
        List<String> upperCaseWords = ElementUtils.transformedList(list, String::toUpperCase);
        System.out.println(upperCaseWords.toString() + "\n");

        System.out.println("Counting characters per word in list..");
        List<Integer> charCount = ElementUtils.transformedList(list, String::length);
        System.out.println(charCount.toString() + "\n");

        //Switching to list of integers
        List<Integer> intList = new ArrayList<>();
        Integer[] ints = {9009,23,54,754,980,2,12,0,542054};

        for (Integer x : ints) {
            intList.add(x);
        }

        System.out.println("Original integer list: " + intList.toString() + "\n");

        System.out.println("Removing zeros..");
        List<Integer> noZeros = ElementUtils.transformedList(intList, s -> {
            if (s != 0) {
                String temp = s.toString();
                StringBuilder newNumber = new StringBuilder();
                for (int i = 0; i < temp.length(); i++) {
                    if (temp.charAt(i) != '0') {
                        newNumber.append(temp.charAt(i));
                    }
                }
                return Integer.parseInt(newNumber.toString());
            } else {
                return null;
            }
        });
        System.out.println(noZeros.toString() + "\n");
    }
}
