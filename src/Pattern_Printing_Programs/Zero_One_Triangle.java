package Pattern_Printing_Programs;

import java.util.Scanner;

public class Zero_One_Triangle {

    public static void main(String[] args) {

        System.out.print("Enter Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if ((i+j)%2 ==0){
                    System.out.print(1 + " ");
                }else {
                    System.out.print(0 + " ");
                }

            }
            System.out.println();
        }

    }
}
