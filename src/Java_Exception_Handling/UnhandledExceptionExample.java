package Java_Exception_Handling;

public class UnhandledExceptionExample {

    public static void main(String[] args) {

        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at Java_Exception_Handling.UnhandledExceptionExample.main(UnhandledExceptionExample.java:7)
        int score = 10/0;
        System.out.println("This line will not execute");
    }
}
