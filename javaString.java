import java.util.*;
public class javaString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First name: ");
        String fname = sc.nextLine();
        System.out.print("Enter your Second name: ");
        String sname = sc.nextLine();
        String fullname = fname + " "  +sname;
        System.out.print("your Full name is : "+fullname);

    }
    
}
