/* The LCM of two numbers is the smallest positive integer that is divisible by both A and B*/    
import java.util.Scanner;
public class Lcm {
    public static int gcd(int a, int b) {
        while(b !=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;


    }
    public static int lcm(int a, int b) {
        int res = (a * b) / gcd(a, b);
        return res;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a, b));
    }

}