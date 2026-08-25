package Loops;

public class HarshadNo {
    public static void main(String[] args) {
        int n=23,sum,rem,t;
        sum=0;
        t=n;
        while(n>0){
            rem = n%10;
            sum+=rem;
            n=n/10;
        }
        if(t%sum==0){
            System.out.println(t+" is Harshad number");
        }
        else{
            System.out.println(t+" is not harshad no");
        }
    }
}
