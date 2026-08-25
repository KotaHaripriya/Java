import java.util.Scanner;

public class arithmetic_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First num: ");
        int a = sc.nextInt();
        System.out.println("Enter Second num: ");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.printf("Addition of %d and %d is %d\n",a,b,sum);//we use printf when we are using place holder

        int sub = a-b;
        System.out.printf("Subtraction of %d and %d is %d \n",a,b,sub);
        int mul = a*b;
        System.out.printf("Multiplication of %d and %d is %d \n",a,b,mul);

        int div = a/b;
        System.out.printf("Divison of %d and %d is %d \n",a,b,div);

        sc.close();
    }
}
