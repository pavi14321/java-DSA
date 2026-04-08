/*Write a function which takes in 2 numbers and returns the greater of those two.
 */
import java.util.Scanner;

public class Greates {
public static int GreatesNum(int a, int b) {
    if(a > b) {
        System.out.print(a);
        return a;
    }
    else {
        System.out.print(b);
        return b;
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a = sc.nextInt();
    System.out.print("Enter the second number: ");
    int b = sc.nextInt();
    System.out.print("The greater number is: ");
    GreatesNum(a, b);
}
}
