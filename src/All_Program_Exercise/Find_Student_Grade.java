package All_Program_Exercise;

import java.util.Scanner;

public class Find_Student_Grade {

    //Calculate Grade Based on Marks.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student mark");
        int marks = scanner.nextInt();

        if (marks >= 0 && marks <=100){
            System.out.println("See your grade please");
        } else {
            System.out.println("enter number only between 0 and 100");
        }
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        }else if (marks >= 50) {
            System.out.println("Grade: B");
        }else if (marks >= 40) {
            System.out.println("Grade: B");
        }
        else {
            System.out.println("Grade: Fail");
        }

    }
}
