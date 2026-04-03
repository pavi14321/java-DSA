/* 
out Put: 
 Enter How many Columns you want: 6
 Enter How many Rows you want: 6
 
******
******
******
******
******
****** */


import java.util.Scanner;

public class Patren1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter How many Columns you want: ");
        int n = sc.nextInt();
        System.out.print(" Enter How many Rows you want: ");
        int m = sc.nextInt();
        for(int i=1; i<=m; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        
    }
}
