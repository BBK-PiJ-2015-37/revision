package java8.streams;

import java.util.Optional;

/**
 * @author Benjamin Winterberg
 */
public class Optional1 {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("bam");

        System.out.println(optional.isPresent());           // true
        System.out.println(optional.get());                 // "bam"
        System.out.println(optional.orElse("fallback"));    // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
    }

}
