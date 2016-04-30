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
public class ElementUtils {

    public static <T> T betterElement(T obj1, T obj2,
                               TwoElementPredicate<T> compare) {
        if (compare.test(obj1, obj2)) {
            return obj1;
        } else {
            return obj2;
        }
    }

    public static <T> List<T> allMatches(List<T> list, Predicate<T> matcher) {
        List<T> result = new ArrayList<>();

        for (T element : list) {
            if (matcher.test(element)) {
                result.add(element);
            }
        }

        return result;
    }

    public static <T,R> List<R> transformedList(List<T> list, Function<T,R> transform) {
        List<R> result = new ArrayList<>();

        for (T obj : list) {
            result.add(transform.apply(obj));
        }

        return result;
    }
}
