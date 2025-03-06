package All_Program_Exercise;

public class Fizz_Buzz_Test {

    public static void main(String[] args) {

        for (int i = 1; i <=100 ; i++) {
            if (i % 3 == 0 && i% 5 == 0){
                System.out.println("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            }
            System.out.println(i);
        }


    }
}
