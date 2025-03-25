package Pattern_Printing_Programs;

import java.util.Scanner;

public class Number_Inc_Pyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Input :");
        int n = sc.nextInt();

        /*
i = 1 , num = 1
i = 2 , num = 1,2
i = 3 , num = 1,2,3
i = 4 , num = 1,2,3,4
i = 5 , num = 1,2,3,4,5
 */
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
