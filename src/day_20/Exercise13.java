package day_20;

import java.util.Arrays;
import java.util.List;

/**
 * Rewrite the solution for (12) so that it can be executed in parallel; verify that you get the
 * same answer both times.
 *
 * @author Sam Jansen
 */
public class Exercise13 {

    public static void main(String[] args) {
        List<Integer> intList = StreamUtils.orderedNumberList(7,7,7000);

        System.out.println("Original list: " + intList.toString());

        //sequential processing
        Integer sum1 = intList.stream()
                                .reduce(0, (a,b) -> a + b);
        System.out.println("Sum of integers (sequential): " + sum1);

        //parallel processing
        Integer sum2 = intList.parallelStream()
                                    .reduce(0, (a,b) -> a + b);
        System.out.println("Sum of integers (parallel): " + sum2);
    }
}
