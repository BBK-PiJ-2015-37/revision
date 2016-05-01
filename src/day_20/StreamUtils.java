package day_20;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class for static methods to aid with Day 20 exercises
 *
 * @author Sam Jansen
 */

public class StreamUtils {

    public static List<Double> randomNumberList(int sizeOfList) {
        return Stream.generate(Math::random)
                                .limit(sizeOfList)
                                    .collect(Collectors.toList());
    }
}
