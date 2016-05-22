package sample_questions;

/**
 * Insert annotation here
 *
 * @author Sam Jansen
 */
public class TestB extends TestA {

    public static void myMethod() {
        System.out.println("TestB::myMethod");
    }

    @Override
    public void anotherMethod() {
        System.out.println("TestB::anotherMethod");
        super.anotherMethod();
    }

    public static void main(String[] args) {
        TestA x1 = new TestB();
        x1.anotherMethod();

        TestB x2 = new TestB();
        x2.anotherMethod();
    }
}
