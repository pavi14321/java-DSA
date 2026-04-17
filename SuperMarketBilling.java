import java.util.Scanner;

public class SuperMarketBilling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String itemName;
        int quantity;
        double price, total = 0;

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("\n----- Super Market Bill -----");

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for item " + i);

            System.out.print("Item Name: ");
            itemName = sc.nextLine();

            System.out.print("Price: ");
            price = sc.nextDouble();

            System.out.print("Quantity: ");
            quantity = sc.nextInt();
            sc.nextLine(); // clear buffer

            double itemTotal = price * quantity;
            total += itemTotal;

            System.out.println("Item Total = " + itemTotal);
        }

        System.out.println("\n-----------------------------");
        System.out.println("Total Bill Amount = " + total);
        System.out.println("-----------------------------");

        sc.close();
    }
}