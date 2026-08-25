package doWhileLoop;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, res, option;
        char choice;
        do {
            System.out.println("1 : Addition");
            System.out.println("2 : Subtraction");
            System.out.println("3 : Multiplicaton");
            System.out.println("4 : Division");

            System.out.println("Enter your option: ");
            option = sc.nextInt();
            System.out.println("Enter a First Num");
            n1 = sc.nextInt();
            System.out.println("Enter a Second Num");
            n2 = sc.nextInt();
            res = switch (option) {
                case 1 -> n1 + n2;
                case 2 -> n1 - n2;
                case 3 -> n1 * n2;
                case 4 -> n1 / n2;
                default -> 0;
            };

            System.out.println("Result is : =" + res);
            System.out.println("Do you want to contiune");
            choice = sc.next().charAt(0);

        } while (choice == 'y');
        System.out.println("Done...");
        sc.close();
    }
}
