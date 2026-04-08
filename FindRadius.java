import java.util.*;

public class FindRadius {
    public static float FindRadius(int r) {
        float pai = 3.14f;
        float radius = pai * r * r;
        System.out.println("The area of the circle with radius " + r + " is: " + radius);
        return radius;  


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int r = sc.nextInt();
        FindRadius(r);
    }
    
}
