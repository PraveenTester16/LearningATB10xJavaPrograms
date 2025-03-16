package Java_Exception_Handling;

public class FinallyDemo {

    public static void main(String[] args) {

        try{
            System.out.println("try block");
        }
        catch (Exception e){
            System.out.println("Catch block");
        }
        finally {
            System.out.println("Finally Block");
        }
        System.out.println("Code outside final block");
    }
}
