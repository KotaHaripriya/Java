import java.util.Scanner;

public class areaOfEquilateraltri {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr side of triangle: ");
        int a = sc.nextInt();
        double area = (Math.sqrt(3)/4)*a*a;
        System.out.println("Area of triangle: "+area);
        sc.close();

    }
}
