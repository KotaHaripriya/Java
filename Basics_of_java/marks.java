import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter s1: ");
        int s1 = sc.nextInt();
        System.out.println("enter s2: ");
        int s2 = sc.nextInt();
        System.out.println("enter s3: ");
        int s3 = sc.nextInt();
        System.out.println("enter s4: ");
        int s4 = sc.nextInt();
        System.out.println("enter s5: ");
        int s5 = sc.nextInt();

        int sum = s1 + s2 + s3 + s4 + s5;

        int avg = sum / 5;

        double percentage = (sum / 500.0) * 100;
        System.out.println("Total : " + sum);
        System.out.println("Avg of Marks: " + avg);
        System.out.println("Percentage of marks: " + percentage);

        sc.close();
    }
}
