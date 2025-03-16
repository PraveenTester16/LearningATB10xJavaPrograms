package Java_Exception_Handling;

public class Try_Inside_Finally {

    public static void main(String[] args) {

        try {
            System.out.println("Inside try block");
            int num = 10 / 2; // No exception
        } catch (Exception e) {
            System.out.println("Inside catch block: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block");
            try {
                int x = 10 / 0; // This will cause an ArithmeticException
            } catch (Exception e) {
                System.out.println("Exception caught inside finally: " + e.getMessage());
            }
        }
        System.out.println("Code after finally block");
    }
    }

