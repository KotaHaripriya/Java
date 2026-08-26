package Funtions;

public class krushnamurty {
    int fact(int n){
        int f =1;
        while(n>=1){
            f=f*n--;
        }
        return f;
    }
    public static void main(String[] args) {
        krushnamurty obj = new krushnamurty();
        int no=145,f,t,rem,sum=0;
        t=no;
        while(no>0){
            rem=no%10;
            f=obj.fact(rem);
            sum=sum+f;
            no=no/10;
        }
        if(t==sum){
            System.out.println(t+" is a krushnamurty num");
        }
        else{
            System.out.println(t+" is not a krushnamurty num");
        }
           
    }
}
