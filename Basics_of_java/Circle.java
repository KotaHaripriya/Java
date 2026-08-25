import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        float r = sc.nextFloat();
        float diameter = 2 * r;
        System.out.println("Diameter of Circle is : " + diameter);
        float area =  3.14f * r * r;
        System.out.println("Area of circle is : " + area);
        float circum = 2 * 3.14f * r;
        System.out.println("Circumference of circle : "+circum);
        sc.close();
    }
}
