/*Enter 3 numbers from the user & make a function to print their average.
 */
import java.util.Scanner;

public class Avg_3 {
    public static int avrage(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.println("Average: "+avg);
        return avg;
        
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        avrage(a, b, c);


    }
}