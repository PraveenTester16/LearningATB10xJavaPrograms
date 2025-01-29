package All_Program_Exercise;

import java.util.Scanner;

public class UserInputExample {

    public static void main(String[] args) {

        // scanner class to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details");

        System.out.println("Enter name :");
        String name = scanner.nextLine();

        System.out.println("Enter Age :");
        int age = scanner.nextInt();

        System.out.println("Details are : " + name + "and age is : " + age);
    }
}
