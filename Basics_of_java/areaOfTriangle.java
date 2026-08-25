import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of triangle: ");
        int height= sc.nextInt();
        System.out.println("Enter base of triangle: ");
        int base = sc.nextInt();
        double area = 0.5 * height * base;
        System.out.println("Area of triangle is : "+area);
        sc.close();
    }
}
