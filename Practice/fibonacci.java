package Practice;

public class fibonacci {
    public static void main(String[] args) {
        int f=0;
        int f1=1;
        int f2;
        int n= 10;
        int count = 3;
        System.out.print(f+" ");
        System.out.print(f1+" ");
        while(count<=n){
            f2=f+f1;
            System.out.print(f2+" ");
            f=f1;
            f1=f2;
            
            count++;
        }

    }
}
