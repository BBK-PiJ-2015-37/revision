package day_19;

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
}
