package day_19;

import java.util.Arrays;

/**
 * For the last sorting example (strings with “e” first), move the logic that computes
 * the number to a separate static method. Now, rewrite the final lambda sorting example,
 * but use a method reference in place of an explicit lambda.
 *
 * @author Sam Jansen
 */
public class Exercise2 {

    public static void main(String[] args) {
        String[] strArray = {"mary","possessed","a","little","lamb",
                "with","fleece","as","white","as","asbestos"};
        System.out.println("Initial array: " + Arrays.asList(strArray));

        Arrays.sort(strArray, StringUtils::eChecker);
        System.out.println("Sorted by presence of 'e': " + Arrays.asList(strArray));
    }
}
