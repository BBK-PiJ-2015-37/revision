package exceptions;

public class Attempt {

    public static void main(String[] args) {
        try {
            System.out.println(throwException());
        } finally {
            System.out.println("Main finally");
        }
    }

    public static String throwException() {
        try {

            try {
                System.out.println("Inner Try reached");
                throw new Exception();
            } catch (RuntimeException e) {                      //Exception thrown above NOT caught here
                System.out.println("Inner Catch reached");
                return "Returned: Inner Nested catch";          //Have return statement BUT finally block execution trumps return
            } finally {
                System.out.println("Inner Finally reached");
                return "Returned: Inner Nested finally";        //Can't return both exception AND return statement - drop the older one (Exception)
            }

        } catch (Exception e) {
            System.out.println("Outer Catch reached");
            return "Returned: Outer Nested catch";
        } finally {                                             //Does this finally block before returning from inner try block
            System.out.println("Outer finally reached");
            return "Returned: Outer Nested finally";            //Can't return both return statements - drop the older one
        }
    }
}

//Print statements:
//Inner Try reached
//Inner Finally reached
//Outer Finally reached
//Returned: Outer Nested finally
//Main finally
