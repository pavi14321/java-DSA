//polindrome munbers checking
import java.util.Scanner;

public class Polindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numer:");
        int num = sc.nextInt();
        int Org = num;
        int rev = 0;
        while(num > 0) {
            int digit = num % 10;
            rev =rev * 10 + digit;
            num = num / 10;
        }
        if(Org == rev) {
            System.out.println("The Number is Polindrome");
        } else {
            System.out.println("The Number is Not Polindrome");
        }
        sc.close();
    }
}
