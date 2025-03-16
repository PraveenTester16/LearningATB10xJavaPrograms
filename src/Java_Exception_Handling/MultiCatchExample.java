package Java_Exception_Handling;

public class MultiCatchExample {

    public static void main(String[] args) {


        try{

            int a = 10, b =0;
            int result = a / b; // Arithmetic exception
            String str = null;
            System.out.println(str.length()); // Null pointer exception

        }

        catch (ArithmeticException | NullPointerException ae){
            System.out.println("Exception " + ae);
        }
        System.out.println("Code after catch");
    }
}
