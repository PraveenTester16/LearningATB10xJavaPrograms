package Java_Exception_Handling;

public class UncheckedExceptionWithArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        System.out.println(numbers [5]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        //	at Java_Exception_Handling.UncheckedExceptionWithArray.main(UncheckedExceptionWithArray.java:6)
    }
}
