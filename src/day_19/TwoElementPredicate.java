package day_19;

/**
 * An interface that takes two elements and returns true if the first is better
 * than the second, false otherwise.
 *
 * @author Sam Jansen
 */
public interface TwoElementPredicate<T> {

    boolean test(T element1, T element2);
}
