import java.util.Scanner;
public class SecLargest {
    public static int seclargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num : arr) {
            if(num > first) {
                second = first;
                first = num;
            }
            else if(num > second && num != first) {
                second = num;

            }
            }
            return second;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int num =sc .nextInt();
            int []arr = new int[num];
            System.out.println("Enter the elements of the array: ");
            for(int i=0; i<num; i++) {
                arr[i] = sc.nextInt();
            }
            int result = seclargest(arr);
            System.out.println("The second largest element is: " + result);

        }
    }
