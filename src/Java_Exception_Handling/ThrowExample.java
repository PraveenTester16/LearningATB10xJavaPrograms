package Java_Exception_Handling;

public class ThrowExample {

    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age should be above 18");

        }
            System.out.println("Valid Age");
        }

        public static void main(String[] args){


            validateAge(15); // Exception in thread "main" java.lang.IllegalArgumentException: Age should be above 18

        }
    }

