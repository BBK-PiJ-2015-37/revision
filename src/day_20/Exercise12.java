package day_20;

import java.util.Arrays;
import java.util.List;

/**
 * The lecture slides illustrated three ways to use streams to compute sums. Use one of the three
 * variations, and compute the sum of some ints.
 *
 * @author Sam Jansen
 */
public class Exercise12 {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(7,12,56,8,43,1,32);

        System.out.println("Original list: " + intList.toString());

        Integer sum = intList.stream()
                        .reduce(0, (a,b) -> a + b);
        System.out.println("Sum of integers: " + sum);
    }
}
