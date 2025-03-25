package Pattern_Printing_Programs;

import java.util.Scanner;

public class Square_Fill_Pattern {

//    *****
//    *****
//    *****
//    *****
//    *****
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Input :");
    int n = sc.nextInt();
    // Outer for loop is used to enter no of rows
    for (int i = 1; i <=n ; i++) {
        // inner loop for column
        for(int j =1 ; j<=5 ; j++){
            System.out.print("*");
        }
        System.out.println();
    }

}

}
