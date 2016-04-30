package day_19;

/**
 * An interface that takes two strings and returns true if the first is better
 * than the second, false otherwise.
 *
 * @author Sam Jansen
 */
public interface TwoStringPredicate {

    boolean test(String s1, String s2);
}
