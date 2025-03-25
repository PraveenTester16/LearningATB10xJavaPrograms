package Pattern_Printing_Programs;

import java.util.Scanner;

public class Right_Half_Prymid {

    //    *
     //   **
     //   ***
     //   ****
     //   *****

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input :");
        int n = sc.nextInt();
/*
i = 1 , stars = 1
i = 2 , stars = 2
i = 3 , stars = 3
i = 4 , stars = 4
i = 5 , stars = 5
 */
        // Outer loop for row
        for (int i = 1; i <=n ; i++) {
            // inner loop for column
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
