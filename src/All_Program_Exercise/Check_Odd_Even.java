package All_Program_Exercise;

import java.util.Scanner;

public class Check_Odd_Even {
    public static void main(String[] args) {

        //Check if a Number is Even or Odd.

        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int myValue = scanner.nextInt();

        if ( myValue %2 ==0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
