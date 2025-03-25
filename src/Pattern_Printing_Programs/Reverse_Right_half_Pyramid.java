package Pattern_Printing_Programs;

import java.util.Scanner;

public class Reverse_Right_half_Pyramid {

    //    *****
    //    ****
    //    ***
    //    **
    //    *

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input :");
        int n = sc.nextInt();

        /*
i = 1 , stars = 5   n = 5 ; starts = n-i+1;
i = 2 , stars = 4
i = 3 , stars = 3
i = 4 , stars = 2
i = 5 , stars = 1
 */
        for (int i = 1; i <=n ; i++) {
            for(int j = 1 ; j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
