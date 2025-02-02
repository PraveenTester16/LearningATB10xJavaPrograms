package All_Program_Exercise;

import java.util.Scanner;

public class Divisible_Five_and_Eleven {

    //Check if a Number is Divisible by 5 and 11
    public static void main(String[] args) {

        System.out.println("Enter a number if its divisible by 5 and 11");
        Scanner scanner = new Scanner(System.in);
        long entryNum = scanner.nextLong();

        boolean result = entryNum %5 == 0 && entryNum %11 ==0;

        if ( result == true){
            System.out.println("The number is divisible by 5 and 11");
        } else {
            System.out.println("Not divisible");
        }
    }
}
