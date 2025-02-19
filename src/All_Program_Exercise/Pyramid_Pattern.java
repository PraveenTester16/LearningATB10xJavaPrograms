package All_Program_Exercise;

import java.util.Scanner;

public class Pyramid_Pattern {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int numbers = sc.nextInt();
//        System.out.println("Enter star/Asterisk");

        for (int i = 1; i<= 5 ; i++)
        {

            for (int j = 1; j<= (5 - i); j++)
            {
                System.out.print(" ");
            }
                for (int k = 1; k<=(2*i) - 1 ; k++)
                {
                    System.out.print("*");
                }
                System.out.println();

            }

        }
    }

