
import java.util.Scanner;

public class ArmStrong {
    public static void main(String args[]) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("Enter Number To Check: ");
        int num = sc.nextInt();
        int OriginalNum = num;
        int sum = 0;
        int digit = String.valueOf(num).length();
        while(num != 0) {
            int digits = num % 10;
            sum = sum + (int)Math.pow(digits, digit);
            num = num / 10;

        }
        if (sum == OriginalNum) {
            System.out.println(OriginalNum + " is an Armstrong Number");
        } else {
            System.out.println(OriginalNum + " is not an Armstrong Number");
        }

    }
}
