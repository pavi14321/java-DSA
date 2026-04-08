import java.util.*;

public class CountNumber {
    public static void CountNumber() {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        char choice;

        // Scanner sc = new Scanner (System.in);
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
           
            if(n > 0) {
                positive++;
            }
            else if(n < 0) {
                negative++;
            }
            else {
                zero++;
            }
            {
                System.out.println("Do you want to continue? (y/n)");
                choice = sc.next().charAt(0);
            }
            
        }
        while(choice == 'y' || choice == 'Y'); {
                System.out.println("Number of positive numbers: " + positive);
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of zeros: " + zero);
            }
    }

    public static void main(String[] args) {
        CountNumber();
    }

}
