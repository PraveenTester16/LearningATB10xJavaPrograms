package All_Program_Exercise;

import java.util.Scanner;

public class Check_Char_Vowel_Consonant {

    public static void main(String[] args) {

        // Check if a Character is a Vowel or Consonant.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any one Character only from A - Z");
        char alphabets = scanner.next().charAt(0);

        alphabets = Character.toLowerCase(alphabets);

        if ( alphabets == 'a'|| alphabets == 'e'|| alphabets == 'i'||
        alphabets == 'o'|| alphabets=='u'){
            System.out.println(alphabets + " Is a Vowel");

        } else if (alphabets >= 'a' && alphabets <= 'z') {
            System.out.println( alphabets + " is a Consonant");
            
        }else {
            System.out.println("You have not entered a letter");
        }
    }
}
