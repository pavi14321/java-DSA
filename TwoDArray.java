import java.util.Scanner;
public class TwoDArray {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter Number of Colums: ");
        int colums = sc. nextInt();
        int [][] numbers = new int [rows][colums];

        //input loop
        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<colums; j++) {
                System.out.println("Enter Number for Rows and Colums: ");
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter Number to Find : ");

        int find = sc.nextInt();

        //find Loop
        for(int i = 0;i<rows; i++) {
            for(int j = 0; j<colums; j++) {
                if(numbers[i][j] ==find) {
                    System.out.println("Number location is : " + i + " " + j);
                }
            }
        }
           
    }
    
}
