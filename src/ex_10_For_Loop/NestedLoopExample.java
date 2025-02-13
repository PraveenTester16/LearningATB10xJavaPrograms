package ex_10_For_Loop;

public class NestedLoopExample {

    public static void main(String[] args) {

        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {  // Outer loop (rows)
            for (int j = 1; j <= i; j++) {  // Inner loop (columns)
                System.out.print("* "); // Print star
            }
            System.out.println(); // Move to the next line
        }
    }
}
