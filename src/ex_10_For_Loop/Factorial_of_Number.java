package ex_10_For_Loop;

import java.util.Scanner;

public class Factorial_of_Number {

    public static void main(String[] args) {

        System.out.println("Factorial of a number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int myFact = sc.nextInt();
        int  fact = 1;

        for (int i = 1; i <= myFact; i++){

            fact = fact*i;
            System.out.println("Factorial of "+myFact+ "is" + fact);
        }
    }
}
