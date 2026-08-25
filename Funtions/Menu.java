package Funtions;

import java.util.Scanner;

public class Menu {
    void prime(int n){
        boolean isPrime=true;
        int i=2;
        while(i<=Math.sqrt(n)){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(n+" is Prime num");
        }
        else
            System.out.println(n+" is not Prime num");
    }
    void factorial(int n){
        int f=1;
        while(n>=1){     
            f=f*n;
            n--;       
        }
        System.out.println("Factorial : "+f);
    }
    void fibonacci(int n){
        int f0=0,f1=1,f2,cmt=3;
        System.out.print(f0+" "+f1+" ");
        while(cmt<=n){
            f2=f0+f1;
            System.out.print(f2+" ");
            f0=f1;
            f1=f2;
            cmt++;
            
        }
    }
    void reverse(int n){
        int rev=0,rem;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("reverse of num is : "+rev);
    }

    public static void main(String args[]){
        int option,n;
        Scanner sc = new Scanner(System.in);
        Menu obj = new Menu();
        System.out.println("1: PrimeCheck");
        System.out.println("2: Factorial");
        System.out.println("3: Fibonicci");
        System.out.println("4: Reverse");
        System.out.println("Enter your option: ");
        option = sc.nextInt();
        System.out.println("Enter num:");
        n = sc.nextInt();
        
        switch (option){
            case 1 : obj.prime(n);
            break;
            case 2 : obj.factorial(n);
            break;
            case 3 : obj.fibonacci(n);
            break;
            case 4 : obj.reverse(n);
            break;
            default:
                System.out.println("Invalid input");

        }        
        
        sc.close();
        
    }
}
