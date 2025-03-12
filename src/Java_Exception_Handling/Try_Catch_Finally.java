package Java_Exception_Handling;

public class Try_Catch_Finally {

    public static void main(String[] args) {

        try {

            int value = 10/0;

        }catch (ArithmeticException ae){
            System.out.println("any number cannot be divisible by 0");
        }finally {
            System.out.println("Always executed");
        }


    }
}
