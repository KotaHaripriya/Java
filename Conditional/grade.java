package Conditional;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics marks: ");
        double p=sc.nextDouble();
        System.out.println("Enter chemistry marks: ");
        double c=sc.nextDouble();
        System.out.println("Enter Bio marks: ");
        double b=sc.nextDouble();
        System.out.println("Enter maths marks: ");
        double m=sc.nextDouble();
        System.out.println("Enter computers marks: ");
        double com=sc.nextDouble();
        double total;
        total=p+c+b+m+com;
        System.out.println("Total Score: "+total);

        double per;
        per = (total/5);
        System.out.println("Percentage: "+per+"%");

        if (per>=90){
            System.out.println("Grade : A");
        }
        if (per<90 && per>=80){
            System.out.println("Grade : B");
        }
        if (per<80 && per>=70){
            System.out.println("Grade : C");
        }
        if (per<70 && per>=60){
            System.out.println("Grade : D");
        }
        if (per<=50){
            System.out.println("Grade : E");
        }
        sc.close();

    }
}
