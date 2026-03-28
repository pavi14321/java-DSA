
import java.util.Scanner;


public class CountDig {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number To Count Digits: ");
        long num = sc.nextLong();
        int count = 0;
        while(num!=0){
            num = num / 10;
            count++;
        }
        System.out.println("Number of Digits: " + count);

    }
    
}
