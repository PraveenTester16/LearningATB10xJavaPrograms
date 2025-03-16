package Java_Exception_Handling;

public class FinallyExceptionDemo {

    public static void main(String[] args) {


        try{
            System.out.println("Inside try block");
            throw new RuntimeException("Exception in try");
        } catch (Exception e){
            System.out.println("inside final block: " + e.getMessage());
        } finally {
            System.out.println("Inside final block");
            int x = 10/0;
        }
        System.out.println("Outside finally block"); // code will not execute
            }
        }

