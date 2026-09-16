package Practice;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int n = inp.nextInt();
        long fact = 1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of num: "+fact);

    }
}
