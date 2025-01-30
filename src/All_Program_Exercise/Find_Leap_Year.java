package All_Program_Exercise;

import java.util.Scanner;

public class Find_Leap_Year {

    // Check if a Year is a Leap Year.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year");
        long year = scanner.nextLong();

        // (Y % 4 == 0) AND (Y % 100 != 0) OR (Y % 400 == 0)

        if( year % 4 ==0 && year % 100 != 0 || year % 400 ==0){
            System.out.println("This is a leap year");
        }else {
            System.out.println("not a leap year");
        }
    }
}
