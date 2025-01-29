package All_Program_Exercise;

import java.util.Scanner;

public class Number_Positive_Negative {

    // Check if a Number is Positive or Negative.
    public static void main(String[] args) {
        //int number = 0;
        System.out.println("Please enter a number it can be positive or negative or Zero");

        // getting user input with scanner class
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
if (number > 0){
    System.out.println("This is a positive");
} else if ( number < 0) {
    System.out.println("This is a negative");
}else {
    System.out.println("its a Zerooooo");
}


    }
}
