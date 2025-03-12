package Java_Exception_Handling;

public class MultipleCatchExample {
    public static void main(String[] args) {

        try{

            int result = 10/0;

           /* 1️⃣ Most specific exception first (e.g., ArithmeticException).
            2️⃣ More general exceptions later (e.g., Exception).
            3️⃣ Exception should always be the last catch block (acts as a fallback).*/

        }catch (ArithmeticException ae){
            System.out.println("Arithmetic exception");
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Array index exception");
        }catch (Exception e){
            System.out.println("Some other exception");
        }

    }
}
