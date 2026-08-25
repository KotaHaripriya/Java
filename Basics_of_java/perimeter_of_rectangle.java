import java.util.Scanner;

public class perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter breadth of rectangle: ");
        int b = sc.nextInt();
        int perimeter = 2*(l+b);
        System.out.println("Perimeter of rectangle : "+perimeter);
        sc.close();

    }

}
