package Conditional;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your basic salary: ");
        int salary=sc.nextInt();
        double gross;
        if(salary<=10000){
            gross = salary+salary*0.2+salary*0.8;
            System.out.println("Gross Salary: "+gross);

        }
        if(salary>10000 && salary<=20000){
            gross = salary+salary*0.25+salary*0.9;
            System.out.println("Gross Salary: "+gross);

        }
        if(salary>20000){
            gross = salary+salary*0.3+salary*0.95;
            System.out.println("Gross Salary: "+gross);

        }
        sc.close();

    }
}
