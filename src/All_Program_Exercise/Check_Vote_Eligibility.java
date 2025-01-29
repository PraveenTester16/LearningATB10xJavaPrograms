package All_Program_Exercise;

import java.util.Scanner;

//Check if a Person is Eligible to Vote (Age Check).
public class Check_Vote_Eligibility {

    public static void main(String[] args) {

        System.out.println("Lets check do you have rights to Vote");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = scanner.nextInt();


        if (age >= 18){
            System.out.println("You can Vote");
        } else{
            System.out.println("You cannot vote");
        }
    }
}
