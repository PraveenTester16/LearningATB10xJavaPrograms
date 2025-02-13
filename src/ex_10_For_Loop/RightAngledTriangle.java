package ex_10_For_Loop;

import java.util.Scanner;

public class RightAngledTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input for number of rows
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Loop to print the triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print stars
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }

    }
