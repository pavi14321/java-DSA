import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int fact = 1; // 1. Start with 1 (because multiplying by 0 results in 0)

        // 2. Multiply 'fact' by every number from 1 up to 'num'
        for (int i = 1; i <= num; i++) {
            fact = fact * i; 
        }

        System.out.println("Factorial: " + fact);
        sc.close();
    }
}