package Funtions;

import java.util.Scanner;

public class reverse {
    int reverse1 (int no){
        int rev=0,rem;
        while(no>0){
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverse obj = new reverse();
        System.out.println("Enter a num: ");
        int num= sc.nextInt();
        if(num==obj.reverse1(num)){
            System.out.println(num+" is palindrome");
        }
        else{
            System.out.println(num+" is not palindrome");
        }
        sc.close();
    }
}
