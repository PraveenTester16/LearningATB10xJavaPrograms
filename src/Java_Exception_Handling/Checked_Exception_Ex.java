package Java_Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Checked_Exception_Ex {

    public static void main(String[] args) {


        try {

            File file = new File("Example.txt");
            Scanner sc = new Scanner(file);

        }catch (FileNotFoundException fee){
            System.out.println("File not found");

        }
    }
}
