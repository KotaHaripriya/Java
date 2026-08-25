import java.util.Scanner;

public class length_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length : ");
        double length = sc.nextDouble();

        double meter = length /100;
        System.out.println(length +" cm in meter is : "+meter);

        double km = meter /1000;
        System.out.println( length+" cm in km is : "+km);
        sc.close();
    }
}
