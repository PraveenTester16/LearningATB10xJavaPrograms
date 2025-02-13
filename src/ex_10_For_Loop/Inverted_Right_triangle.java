package ex_10_For_Loop;

import java.util.Scanner;

public class Inverted_Right_triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int totalRows = sc.nextInt();

        for (int i =totalRows ; i >=totalRows ; i--){
            for (int j = totalRows ; j >=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
