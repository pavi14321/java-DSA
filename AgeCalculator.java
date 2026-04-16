import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input DOB
        System.out.print("Enter your DOB (yyyy-mm-dd): ");
        String dobInput = sc.nextLine();

        // Convert String to Date
        LocalDate dob = LocalDate.parse(dobInput);

        // Current Date
        LocalDate currentDate = LocalDate.now();

        // Calculate Age
        Period age = Period.between(dob, currentDate);

        System.out.println("Your Age is: "
                + age.getYears() + " years "
                + age.getMonths() + " months "
                + age.getDays() + " days");

        sc.close();
    }
}