/* Find the missing number from an array containing numbers from 1 to N.
📥 Sample Input:
5
1 2 3 5
📤 Sample Output: 4
*/ 
import java.util.*;
public class Missing {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n-1];
    int sum = 0;
    for(int i = 0; i< n-1; i++) {
        arr[i] =sc.nextInt();
        sum += arr[i];
    }
    int totalsum = n*(n+1)/2;
    int missing = totalsum - sum;
    System.out.println(missing);

}
}