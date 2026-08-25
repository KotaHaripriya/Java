import java.util.Scanner;

public class ConversionFtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double temp = sc.nextDouble();
        double res = (temp-32)*(9.0/5);
        System.out.println(temp+"F in celsius in Celsius is : "+res);

        sc.close();

    }
}
