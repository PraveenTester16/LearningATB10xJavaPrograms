package Pattern_Printing_Programs;

import java.util.Scanner;

public class Right_Pascal_Triangle {

    public static void main(String[] args) {

        int n = 5;

        /*System.out.print("Enter Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();*/

        // first half of pyramid
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // second half of pyramid
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
