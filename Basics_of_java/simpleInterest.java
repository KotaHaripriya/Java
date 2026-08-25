import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter P: ");
        int P = sc.nextInt();
        System.out.println("Enter R: ");
        int R = sc.nextInt();
        System.out.println("Enter T: ");
        int T = sc.nextInt();
        double SI = (P*R*T)/100.0;
        System.out.println("Simple interest: "+SI);
        sc.close();
    }
}
