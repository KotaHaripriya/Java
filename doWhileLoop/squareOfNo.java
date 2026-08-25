package doWhileLoop;

import java.util.Scanner;

public class squareOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        char choice;
        do {
            System.out.println("Enter any num: ");
            no = sc.nextInt();
            System.out.println(no + " : " + no * no);
            System.out.println("Do you want to contiune (y/n) ?");
            choice = sc.next().charAt(0);

        } while (choice == 'y');
        System.out.println("Done..");
        sc.close();
    }
}
