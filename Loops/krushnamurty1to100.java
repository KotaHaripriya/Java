package Loops;

public class krushnamurty1to100 {
    public static void main(String[] args) {
        int no=1,n,rem,sum,t,f;
        while(no<=50000){
            t=no;
            sum = 0;
            n=t;
            while(n>0){
                rem=n%10;
                f=1;
                while(rem>=1){
                    f=f*rem;
                    rem--;
                }
                sum += f;
                n=n/10;
            }
            if(t==sum)
                System.out.println(t+" ");
            no++;
        }
    }
}
