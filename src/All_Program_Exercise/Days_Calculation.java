package All_Program_Exercise;

import java.util.Scanner;

public class Days_Calculation {

    // Convert Days into Years, Months, and Days.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Days");
        int totalDays = scanner.nextInt();

        // Convert days to years, months, and remaining days
        int years = totalDays / 365;  // 1 year = 365 days
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;  // 1 month = 30 days
        int days = remainingDays % 30;  // Remaining days after extracting months

        // Display the result
        System.out.println(totalDays + " days = " + years + " years, " + months + " months, and " + days + " days.");
    }
}
