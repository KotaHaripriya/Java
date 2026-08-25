import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length : ");
        int l = sc.nextInt();
        System.out.println("Enter a breadth : ");
        int b = sc.nextInt();
        int area = l*b;
        System.out.println("Area of rectangle is : "+area);
        sc.close();
    }
}
