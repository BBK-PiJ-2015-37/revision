package day_19;

/**
 * A class for static methods used in day 19 exercises
 *
 * @author Sam Jansen
 */
public class StringUtils {

    public static int eChecker(String s1, String s2) {
        if (s1.contains("e") && !s2.contains("e")) {
            return -1;
        } else if (!s1.contains("e") && s2.contains("e")) {
            return 1;
        } else {
            return 0;
        }
    }
}
