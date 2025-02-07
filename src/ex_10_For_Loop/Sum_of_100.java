package ex_10_For_Loop;

public class Sum_of_100 {

    public static void main(String[] args) {

        int sum = 0; // Initialize sum variable

        // Loop from 1 to 100 and add each number to sum
        for (int i = 1; i <= 100; i++) {
            sum += i; // sum = sum + i
        }

        // Print the final sum
        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
    }
    }
