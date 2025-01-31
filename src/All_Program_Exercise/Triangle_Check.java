package All_Program_Exercise;

import java.util.Scanner;

public class Triangle_Check {

    // Check if a Triangle is Valid Based on Three Sides.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side");
        float sideA = scanner.nextFloat();
        System.out.println("Enter second side");
        float sideB = scanner.nextFloat();
        System.out.println("Enter Third side");
        float sideC = scanner.nextFloat();

        // A triangle is valid if the sum of any two sides is greater than the third side:
        //
        //a + b > c
        //a + c > b
        //b + c > a

        if ( sideA + sideB > sideC == true || sideA + sideC > sideB ==true
                || sideB + sideC > sideA ==true){
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}
