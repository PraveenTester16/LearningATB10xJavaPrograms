package All_Program_Exercise;

import java.util.Scanner;

public class Smallest_Three_Numbers {

    public static void main(String[] args) {

        //Find the Smallest of Three Numbers.
        System.out.println("Find the smallest number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("FIRST NUMBER");
        int value1 = scanner.nextInt();

        System.out.println("SECOND NUMBER");
        int value2 = scanner.nextInt();

        System.out.println("THIRD NUMBER");
        int value3 = scanner.nextInt();

        if( value1 < value2){
            System.out.println("Number one is lesser");
        } else if ( value2 < value3) {
            System.out.println("Number two is lesser");
        }else if(value3 < value1){
            System.out.println("number three is lesser");
        } else {
            System.out.println("numbers are equal");
        }
    }
}
