/*Count how many 0s are present in array.

📥 Input
6
1 0 2 0 3 0
📤 Output
3 */
import java.util.Scanner;

class CountZero{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int count = 0;
        for(int i =0; i <n; i++)
        {
            System.out.print("");
            long num = sc.nextLong();
            if(num == 0)
            {
                count++;

            }

        }
        System.out.println("Number of Zeros in Array: "+count);
        sc.close();
    }
}
