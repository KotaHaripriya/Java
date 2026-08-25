import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter P:");
        int p = sc.nextInt();
        System.out.println("Enter R:");
        int r = sc.nextInt();
        System.out.println("Enter T:");
        int t = sc.nextInt();
        double A = p*Math.pow((1+(r/100.0)),t);
        System.out.println("Final Amount : "+A);
        double CI = A - p;
        System.out.println("Compound Interest : "+CI);
        sc.close();


    }
}
