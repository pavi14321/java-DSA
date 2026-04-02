/*Problem: Decimal to Binary Conversion

📥 Input: 10
📤 Output: 1010
 */
import java.util.Scanner;

class Binary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String binary = " ";
        while(num > 0) {
            int reminder = num % 2;
            binary = reminder + binary;
            num = num/2;
        }
        System.out.println(binary);

    }
}