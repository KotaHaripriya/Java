package ForLoops;

public class krushnamurtyNoSeries {
    public static void main(String[] args) {
         int rem,sum,t,f,n;
         for(int no=1;no<=50000;no++){
            t=no;
            sum = 0;
            n=t;
            for(;n>0;){
                rem= n %10;
                f=1;
                for(;rem>=1;rem--){
                    f=f*rem;
                }
                n=n/10;
                sum+=f;
            }
            if(t==sum)
                System.out.println(t+" ");
            
       
    }
}
}
