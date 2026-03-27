//Prime Number Checker

import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        if(isPrime(num)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    
}
public static boolean isPrime(int n) {
    if(n < 2){
        return false;
    }
    for(int i = 2; i < n; i++){
        if(n % i == 0){
return false;
        }
    } 
    return true;
}
}