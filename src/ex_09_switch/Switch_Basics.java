package ex_09_switch;

import java.util.Scanner;

public class Switch_Basics {

    public static void main(String[] args) {

        System.out.println("Enter day from 1 to 7");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day){

            case 1 :
                System.out.println("MON");
                break;

            case 2 :
                System.out.println("TUE");
                break;

            case 3 :
                System.out.println("WED");
                break;

            case 4:
                System.out.println("THU");
                break;

            case 5 :
                System.out.println("FRI");
                break;

            case 6 :
                System.out.println("SAT");
                break;

            case 7 :
                System.out.println("SUN");
                break;

            default :
                System.out.println("Invalid entry");
                break;
        }
    }
}
