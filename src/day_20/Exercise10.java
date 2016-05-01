package day_20;

import java.util.List;

/**
 * Write a static method that produces a List of a specified length of random numbers.
 *
 * @author Sam Jansen
 */
public class Exercise10 {

    public static void main(String[] args) {
        List<Double> list1 = StreamUtils.randomNumberList(5);
        List<Double> list2 = StreamUtils.randomNumberList(10);
        List<Double> list3 = StreamUtils.randomNumberList(15);

        System.out.println("First list: " + list1.toString());
        System.out.println("Second list: " + list2.toString());
        System.out.println("Third list: " + list3.toString());
    }
}
