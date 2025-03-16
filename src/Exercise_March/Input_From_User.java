package Exercise_March;

import java.util.Scanner;

public class Input_From_User {
    public static void main(String[] args) {

        System.out.println("Start");

        System.out.println("Enter serial number");
        Scanner scNo = new Scanner(System.in);
        int serialNo = scNo.nextInt();

        System.out.println("Enter Name");
        Scanner scName = new Scanner(System.in);
        String name = scName.nextLine();

        System.out.println("Enter Age");
        Scanner scAge = new Scanner(System.in);
        int age = scAge.nextInt();

        System.out.println(" your serial no is: " + serialNo + " and name is: " + name + " and age is: " + age + " ");



    }

}
