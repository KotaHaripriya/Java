import java.util.Scanner;

public class triangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first angle of triangle: ");
        double a1 = sc.nextDouble();
        System.out.println("Enter second angle of triangle: ");
        double a2 = sc.nextDouble();
        double a3 = 180-(a1+a2);
        System.out.println("The third angle of triangle is "+a3);
        sc.close();

    }
}
