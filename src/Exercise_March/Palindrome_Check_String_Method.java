package Exercise_March;

import java.util.Scanner;

public class Palindrome_Check_String_Method {

    public static void main(String[] args) {
        // Palindrome : civic, radar, level, rotor, kayak, madam, and refer
        //String myString = "RADAR";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word");
        String myString = sc.nextLine();
        sc.close();

        String reversedString = new StringBuilder(myString).reverse().toString();

        if (myString.equalsIgnoreCase(reversedString)){
            System.out.println(myString + " is a Palindrome");
        }else {
            System.out.println(myString + " is not a palindrome");
        }
    }



}
