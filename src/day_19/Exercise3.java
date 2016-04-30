package day_19;

/**
 * Create a class with a static method called betterString. This method should
 * take two Strings and a lambda as its arguments. This lambda states whether the
 * first of the two strings is better.
 *
 * The method should return the better string; i.e., if the lambda returns true the
 * method should return the first string, otherwise it should return the second string.
 *
 * For the lambda, define an interface called TwoStringPredicate with a method that
 * takes two Strings and returns true if the first is better than the second, false
 * otherwise.
 *
 * @author Sam Jansen
 */
public class Exercise3 {

    public static void main(String[] args) {
        String str1 = "This is the first string";
        String str2 = "This is the second string";
        String result;
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2 + "\n");

        System.out.println("Printing the longer string...");
        result = StringUtils.betterString(str1, str2, (s1,s2) -> s1.length() > s2.length());
        System.out.println(result + "\n");

        System.out.println("Printing the first string...");
        result = StringUtils.betterString(str1, str2, (s1, s2) -> true);
        System.out.println(result);
    }
}
