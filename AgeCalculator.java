

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

    public static int calculateAge(LocalDate dob) {
        LocalDate today = LocalDate.now();
        return Period.between(dob, today).getYears();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for DOB input
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String input = scanner.nextLine();

        // Convert string to LocalDate
        LocalDate dob = LocalDate.parse(input);

        // Calculate age
        int age = calculateAge(dob);
        System.out.println("You are " + age + " years old.");
    }
}
