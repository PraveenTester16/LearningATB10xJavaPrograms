package Pattern_Printing_Programs;

import java.util.Scanner;

public class Num_Inc_Rev_Pattern {
    public static void main(String[] args) {

        System.out.print("Enter Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
