package All_Program_Exercise;

import java.util.Scanner;

public class Largest_Three_Numbers {

    // Find the Largest of Three Numbers.
    public static void main(String[] args) {

        System.out.println("Finding largest number for the three");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = scanner.nextInt();

        System.out.println("Enter second number");
        int secondNum = scanner.nextInt();

        System.out.println("Enter third number");
        int thirdNum = scanner.nextInt();

        if (firstNum > secondNum ){
            System.out.println("number first is the largest");
        } else if (secondNum > thirdNum) {
            System.out.println("number second is the largest");
        } else if ( thirdNum > firstNum) {
            System.out.println("number third is the largest");
        }else {
            System.out.println("numbers must be equal");
        }
    }
}
