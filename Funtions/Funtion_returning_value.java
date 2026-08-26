package Funtions;

import java.util.Scanner;

public class Funtion_returning_value {

    int add(int a,int b){
        int res = a+b;
        return res;
    }
    public static void main(String[] args) {
       Funtion_returning_value obj=new Funtion_returning_value();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter num1:");
       int x = sc.nextInt();
       System.out.println("Enter num2:");
       int y = sc.nextInt();
       int result = obj.add(4,9) ;
       int res1 = obj.add(x,y);

       System.out.println("Addition is : "+result);
       System.out.println("Addition is : "+res1);
       sc.close();

    }
}
