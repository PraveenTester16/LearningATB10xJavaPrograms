package All_Program_Exercise;

import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {

        //Find the Maximum of Two Numbers.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        double number1 = scanner.nextDouble();
        System.out.println("Enter Second Number");
        double number2 = scanner.nextDouble();

        if (number1 > number2){
            System.out.println("Number one is the maximum");
        } else if (number2 > number1){
            System.out.println("Number Two is the Maximum");
        }else{
            System.out.println("They are equal");
        }

    }
}
