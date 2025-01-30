package All_Program_Exercise;

import java.util.Scanner;

public class Smallest_Two_Numbers {

    //Find the Smallest of Two Numbers
    public static void main(String[] args) {

        System.out.println("Find the smallest of two numbers");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int smallNum1 = scanner.nextInt();

        System.out.println("Enter second number");
        int smallNum2 = scanner.nextInt();

        if (smallNum1 < smallNum2){

            System.out.println("Number first is smallest");
        } else if ( smallNum2 < smallNum1) {
            System.out.println("Number second is smallest");
        } else {
            System.out.println("You have entered the same number so its equal");
        }
    }
}
