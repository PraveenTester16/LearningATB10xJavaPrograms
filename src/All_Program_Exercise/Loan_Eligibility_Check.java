package All_Program_Exercise;

import java.util.Scanner;

public class Loan_Eligibility_Check {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        System.out.println("Enter Salary");
        double salary = sc.nextDouble();
        System.out.println("Enter Credit Score");
        int creditScore = sc.nextInt();

        // age validation
        if(age >=18 && age <18 || age <=80 && salary <=30000 && creditScore >= 650 || creditScore >=850 ) {
            System.out.println("Your are eligible for loan");
        } else {
            System.out.println("not eligible");
        }

    }
}
