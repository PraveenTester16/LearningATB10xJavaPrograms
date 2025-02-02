package All_Program_Exercise;

import java.util.Scanner;

public class Senior_Citizen_Check {

    public static void main(String[] args) {

        System.out.println("Senior Citizen Zone");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        if(age >= 0 && age <=12){
            System.out.println("Child");
        } else if ( age >=13 && age <=19) {
            System.out.println("Teenager");
        } else if (age >=20 && age <=64) {
            System.out.println("Adult");
        } else if (age >=65) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("Wrong input form user");
        }
    }
}
