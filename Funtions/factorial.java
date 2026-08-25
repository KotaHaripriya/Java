package Funtions;

public class factorial {
    void factorial1() {
        int n=5,f=1,t;
        t=n;
        while(n>=1){
            f=f*n;
            n--;
        }
        System.out.println("Factorial of "+t+ " : "+f);

    }
    public static void main(String[] args) {
        factorial obj = new factorial();
        obj.factorial1();
    }
}
