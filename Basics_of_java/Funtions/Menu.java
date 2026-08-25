package Funtions;

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
    void 
    public static void main(String args[]){
        
    }
}
