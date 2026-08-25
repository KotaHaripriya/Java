import java.util.Scanner;

public class power2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base : ");
        int num = sc.nextInt();
        System.out.println("Enter index: ");
        int index = sc.nextInt();

        int res = (int) Math.pow(num, index);
        System.out.println("Result of " + num + "^" + index + ": " + res);
        sc.close();
        int res1 = 1;
        int i;
        for (i = 1; i <= index; i++) {
            res1 *= num;

        }
        System.out.println("Result is : " + res1);
    }
}
