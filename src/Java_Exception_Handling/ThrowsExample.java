package Java_Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsExample {

    public static void readFile() throws FileNotFoundException {  // Declaring exception
        File file = new File("nonexistent.txt");
        Scanner sc = new Scanner(file);  // ❌ May throw FileNotFoundException
    }

    public static void main(String[] args) {
        try {
            readFile();  // ⚠ Call must handle or declare exception
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
