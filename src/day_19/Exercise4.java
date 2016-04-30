package day_19;

/**
 * Use generics to replace betterString with betterEntry and TwoStringPredicate
 * with TwoElementPredicate. Make sure your previous examples still work when you
 * only change betterString to betterElement.
 *
 * @author Sam Jansen
 */
public class Exercise4 {

    public static void main(String[] args) {
        String str1 = "This is the first string";
        String str2 = "This is the second string";
        String result1;
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2 + "\n");

        System.out.println("Printing the longer string...");
        result1 = ElementUtils.betterElement(str1, str2, (s1,s2) -> s1.length() > s2.length());
        System.out.println(result1 + "\n");

        System.out.println("Printing the first string...");
        result1 = ElementUtils.betterElement(str1, str2, (s1, s2) -> true);
        System.out.println(result1 + "\n");

        Integer int1 = 357435485;
        Integer int2 = 214714436;
        Integer result2;
        System.out.println("Integer 1: " + int1);
        System.out.println("Integer 1: " + int2 + "\n");

        System.out.println("Printing the bigger integer...");
        result2 = ElementUtils.betterElement(int1, int2, (s1,s2) -> s1 > s2);
        System.out.println(result2 + "\n");

        System.out.println("Printing the bigger integer if integers had been reversed...");
        result2 = ElementUtils.betterElement(int1, int2, (s1,s2) -> {
            String strA = s1.toString();
            String strB = s2.toString();
            StringBuilder reverse1 = new StringBuilder();
            StringBuilder reverse2 = new StringBuilder();

            for (int i = strA.length() - 1; i >= 0; i--) {
                reverse1.append(strA.charAt(i));
            }
            for (int i = strB.length() - 1; i >= 0; i--) {
                reverse2.append(strB.charAt(i));
            }

            Integer newInt1 = Integer.parseInt(reverse1.toString());
            Integer newInt2 = Integer.parseInt(reverse2.toString());

            return (newInt1 > newInt2);
        });
        System.out.println(result2 + "\n");
    }
}
