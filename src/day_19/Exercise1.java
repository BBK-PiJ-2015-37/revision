package day_19;

/**
 * Create an array containing some Strings. Sort the array by:
 *     • length (i.e., shortest to longest)
 *     • reverse length (i.e., longest to shortest)
 *     • first character
 *     • Strings that contain “e” first, everything else second.
 *
 * @author Sam Jansen
 */

import java.util.Arrays;

public class Exercise1 {

    public static void main(String... args) {
        String[] strArray = {"mary","possessed","a","little","lamb",
                            "with","fleece","as","white","as","asbestos"};
        System.out.println("Initial array: " + Arrays.asList(strArray));

        //sorting by length
        Arrays.sort(strArray, (s1,s2) -> s1.length() - s2.length());
        System.out.println("Sorted by length: " + Arrays.asList(strArray));

        //sorting by reverse length
        Arrays.sort(strArray, (s1,s2) -> s2.length() - s1.length());
        System.out.println("Sorted by reverse length: " + Arrays.asList(strArray));

        //sorting by first character
        Arrays.sort(strArray, (s1,s2) -> s1.charAt(0) - s2.charAt(0));
        System.out.println("Sorted by first character: " + Arrays.asList(strArray));

        //sorting by presence of e
        Arrays.sort(strArray, (s1,s2) -> {
            if (s1.contains("e") && !s2.contains("e")) {
                return -1;
            } else if (!s1.contains("e") && s2.contains("e")) {
                return 1;
            } else {
                return 0;
            }
        });
        System.out.println("Sorted by presence of 'e': " + Arrays.asList(strArray));
    }
}
