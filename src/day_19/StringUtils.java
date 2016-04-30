package day_19;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

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

    public static String betterString(String s1, String s2,
                                       TwoStringPredicate compare) {
        if (compare.test(s1, s2)) {
            return s1;
        } else {
            return s2;
        }
    }

    public static List<String> allMatches(List<String> list,
                                          Predicate<String> matcher) {

        List<String> result = new ArrayList<>();

        for (String word : list) {
            if (matcher.test(word)) {
                result.add(word);
            }
        }

        return result;
    }

    public static List<String> transformedList(List<String> list,
                                               Function<String, String> transform) {
        List<String> result = new ArrayList<>();

        for (String word: list) {
            result.add(transform.apply(word));
        }

        return result;
    }
}
