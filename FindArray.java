import java.util.Scanner;
public class FindArray {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array: ");
        int size = sc.nextInt();
        int []arr = new int[size];

        System.out.println("Enter The Elements Of Array: ");
        for(int i = 0; i<size; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("Enter The Eliment To Search: ");
        int find = sc.nextInt();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == find) {
                System.out.println("Element Found At Index: " + i);
                return;
            }
        }
        System.out.println("Element Not Found");
    }
}