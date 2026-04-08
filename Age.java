import java.util.Scanner;

public class Age {
    public static int age(int age) {
        if(age > 18) {
            System.out.println("Elligible to vote");    
        }
        else {
            System.err.println("Not Elligible to vote");
        }
        return age;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        age(age);
    }
}
