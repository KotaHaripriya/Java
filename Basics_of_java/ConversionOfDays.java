import java.util.Scanner;

public class ConversionOfDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a days: ");
        int days = sc.nextInt();
        int years = days/365;
        days = days%365;
        int months = days/30;
        days = days%30;
        int weeks = days/7;
        days = days%7;
        System.out.println(years+" year");
        System.out.println(months+" months");
        System.out.println(weeks+" weeks");

        sc.close();


    }
}
