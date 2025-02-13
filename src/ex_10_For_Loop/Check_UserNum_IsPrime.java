package ex_10_For_Loop;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class Check_UserNum_IsPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        long myPrime = sc.nextLong();

        if (myPrime <2){
            System.out.println("This is not prime");
        }if (myPrime ==2){
            System.out.println("Smallest prime Number");
        }

        for (int i = 2; i <= Math.sqrt(myPrime); i++) {
            // Code to check divisibility
            long result = myPrime % i;
            System.out.println("Not Prime " + result);
        }
    }
}
