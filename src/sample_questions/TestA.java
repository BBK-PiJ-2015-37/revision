package sample_questions;

/**
 * Insert annotation here
 *
 * @author Sam Jansen
 */
public class TestA {

    public static void myMethod() {
        System.out.println("TestA::myMethod");
    }

    public void anotherMethod() {
        System.out.println("TestA::anotherMethod");
        myMethod();
    }
}
