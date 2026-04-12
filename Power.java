/*Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
 */
import java.util.*;

public class Power {
    public static int pow(int x, int n) {
        int result = 1;
        for(int i = 1; i<=n; i++) {
            result = result * x;
        }
        return result;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x value: ");
        int x = sc.nextInt();
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        System.out.println(x + " raised to the power of " + n + " is: " + pow(x, n));
        sc.close();
        pow(x, n);

    } 
    
}
