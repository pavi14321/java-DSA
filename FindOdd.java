/*Write a function to print the sum of all odd numbers from 1 to n.
 */
import java.util.*;

public class FindOdd {
    public static int findOdd(int n) {
        int sum = 0;

        for(int i = 0; i<=n; i++) {
            if(i % 2 !=0)
            {
                sum = sum + i;

            }
        }
        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        findOdd(n);
    }

    
}
