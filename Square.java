import java.util.Scanner;

public class Square {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number : ");
    int a = sc.nextInt();
    System.out.print("Enter root Number: ");
    int b = sc.nextInt();
    int result = 1;
    for(int i = 1; i<= b; i++)
    {
        result *= a;
    }   
System.err.println("result: " + result);
}    
}
