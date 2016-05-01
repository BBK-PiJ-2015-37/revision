package day_20;

import java.util.Arrays;
import java.util.List;

/**
 * Now, use streams to compute the product of some doubles. Show that serial and parallel
 * versions do not always give the same answer.
 *
 * @author Sam Jansen
 */
public class Exercise14 {

    public static void main(String[] args) {
        List<Double> dblList = Arrays.asList(12.0,5.0,30.0,4.0,15.0,27.0,38.0);

        System.out.println("Original list: " + dblList.toString());

        //sequential processing
        Double product1 = dblList.stream()
                                    .reduce(1.0, (a,b) -> a*b);
        System.out.println("Product of doubles (sequential): " + product1);

        //parallel processing
        Double product2 = dblList.parallelStream()
                                    .reduce(1.0, (a,b) -> a*b);
        System.out.println("Product of doubles (parallel): " + product2);
    }
}
