package All_Program_Exercise;

import java.util.Scanner;

public class Atm_Withdrawl {

    public static void main(String[] args) {

        final long accountBalance = 10000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amount with multiples of 100");
        long withdrew_Cash = scanner.nextLong();

        if( withdrew_Cash >= 0 && withdrew_Cash <= accountBalance && withdrew_Cash % 100 ==0) {
            System.out.println("Transaction successful of RS :" + withdrew_Cash);
            long newBalance = accountBalance - withdrew_Cash;
            System.out.println("Balance is :" + newBalance);

        } else if ( withdrew_Cash > accountBalance) {
            System.out.println("Invalid Balance");
        } else {
            System.out.println("Transaction declined due to technical reason or you may not have entered amount in multiples of 100");
        }
    }
}
