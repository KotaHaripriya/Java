import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        int res = (int) Math.sqrt(num);
        System.out.println("Result is : " + res);
        sc.close();

        int sqrt=0;
        int i;

        for (i = 1; i <= num; i++) {
            if (i * i == num) {
                sqrt = i;
                break;
            }

        }
        System.out.println("Result is : " + sqrt);

    }
}
