package Funtions;

public class prime {
    boolean isPrime(int n){
        int i=2;
        boolean prime=true;
        while(i<=Math.sqrt(n)){
            if(n%i==0){
                prime=false;
                break;
            }
            i++;
        }
        return prime;
    }
    public static void main(String[] args) {
        prime obj=new prime();
        int no=1;
        while(no<=100){
            if(obj.isPrime(no)){
                System.out.println(no+" ");
            }
            no++;
        }

    }
}
