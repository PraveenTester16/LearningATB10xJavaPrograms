package ex_10_For_Loop;

import java.util.Scanner;

public class User_Multiplication {

    public static void main(String[] args) {

        System.out.println("Enter a number for multiplication");
        Scanner sc = new Scanner(System.in);
        long tables = sc.nextLong();

        for (int i = 1; i <=100;i++){
           long results = tables *i;
            System.out.println("Answer is :" + results);
        }
    }
}
