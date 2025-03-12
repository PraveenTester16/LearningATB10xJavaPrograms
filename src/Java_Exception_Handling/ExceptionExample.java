package Java_Exception_Handling;

public class ExceptionExample {

    public static void main(String[] args) {

        try{

            int result = 10/0; // this is an exception a number cannot be divisible by 0

        }catch (ArithmeticException arith){

            System.out.println("Cannot divide by zero");
        }
    }
}
