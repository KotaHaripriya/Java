package Conditional;

import java.util.Scanner;

public class alphabetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet: ");
        char s = sc.next().charAt(0);
        if(s=='a'||s=='A'||s=='e'||s=='E'||s=='I'||s=='i'||s=='o'||s=='O'||s=='u'||s=='U'){
            System.out.println("It is vowel");
        }
        else{
            System.out.println("It is Consonant");
        }

        sc.close();
    }
}
