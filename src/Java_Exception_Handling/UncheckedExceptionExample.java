package Java_Exception_Handling;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int result = 10/0;
        System.out.println(result); // ArithmeticException

        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at Java_Exception_Handling.UncheckedExceptionExample.main(UncheckedExceptionExample.java:5)
    }
}
