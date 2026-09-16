package Practice;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int n = sc.nextInt();
        int t = n;
        int sum=0;
        int rem;
        while(n>0){
            rem=n%10;
            sum+=rem*rem*rem;
            n=n/10;

        }
        if(t==sum){
            System.out.println("it is armstrong");
        }
    }
}
