package day_20;

import java.util.List;

/**
 * Write a static method that produces a list of numbers that go in order by a step size.
 *
 * @author Sam Jansen
 */
public class Exercise11 {

    public static void main(String[] args) {
        List<Integer> list1 = StreamUtils.orderedNumberList(50,5,10);
        List<Integer> list2 = StreamUtils.orderedNumberList(10,-1,20);
        List<Integer> list3 = StreamUtils.orderedNumberList(7,0,7);
        List<Integer> list4 = StreamUtils.orderedNumberList(7,7,0);

        System.out.println("First list: " + list1.toString());
        System.out.println("Second list: " + list2.toString());
        System.out.println("Third list: " + list3.toString());
        System.out.println("Fourth list: " + list4.toString());
    }
}
