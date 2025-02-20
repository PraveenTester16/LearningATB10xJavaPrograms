package All_Program_Exercise;

import java.util.Scanner;

public class Input_From_User {

    public static void main(String[] args) {

        System.out.println("GET INPUT FROM USER WITh SCANNER CLASS");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NAME");
        String name = sc.nextLine();
        System.out.println("ENTER AGE");
        int age = sc.nextInt();

        if (age >=18 && age<=50){
            System.out.println("You are eligible to continue");
        } else {
            System.out.println("Not allowed to continue");
        }
        System.out.println("Name is " + name + " and age is " + age);
    }
}
