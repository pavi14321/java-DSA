
import java.util.Scanner;

public class SecSmallest {
    public static int secondSmallest(int arr[]) {
        int firsts = Integer.MAX_VALUE;
        int seconds = Integer.MAX_VALUE;
        for(int num : arr) {
            if(num < firsts) {
                seconds = firsts;
                firsts = num;

            }
            else if(num < seconds && num != firsts) {
                seconds = num;
            }
        }
        return seconds;

    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = secondSmallest(arr);
        System.out.println("The second smallest element is: " + result);
    }
    
}
