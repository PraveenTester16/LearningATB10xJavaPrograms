package All_Program_Exercise;

import java.util.Scanner;

public class Check_Char_Alphabet {

    //Check if a Character is an Alphabet.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Character");
        char ch = scanner.next().charAt(0);

        //ch = Character.toLowerCase(ch);

        if (ch >= 'A' && ch<= 'Z' || ch >= 'a' && ch<= 'z'){
            System.out.println("This is a alphabet");
        }else {
            System.out.println("Not an alphabet");
        }
    }
}
