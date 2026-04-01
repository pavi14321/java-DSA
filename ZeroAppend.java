/*🧾 Problem

Move all 0’s to end without changing order.

📥 Input
6
6 0 1 8 0 2
📤 Output
6 1 8 2 0 0 */
import java.util.Scanner;

public class ZeroAppend {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();

        }
        for(int i=0; i < n; i++)
        {
            if(arr[i] != 0)
            {
                arr[count++] = arr[i];

            }
        }
        for(int i=count; i<n; i++)
        { 
            arr[i] = 0;
        }
        for(int i=0; i<n;i++)
        {
            System.out.print(arr[i]+" ");

        }
    }
}
