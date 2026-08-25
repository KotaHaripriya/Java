package Conditional;

import java.util.Scanner;

public class Maxi_bet_3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 :");
        int a  = sc.nextInt();
        System.out.println("Enter num2 :");
        int b  = sc.nextInt();
        System.out.println("Enter num3 :");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("num1: "+a+" is greater");
        }
        else if(b>c){
            System.out.println("num2: "+b+"is greater");
        }
        else{
            System.out.println("num3: "+c+" is greater");
        }
        sc.close();

    }
}
