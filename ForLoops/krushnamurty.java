package ForLoops;

public class krushnamurty {
    public static void main(String[] args) {
        int num=3,rem,sum=0,t,f;
        t = num;
        
        for(;num>0;){
           rem=num%10; 
           f = 1;
           for(;rem>=1;rem--){
                f = f*rem;
           }
           num=num/10;
           sum+=f;
        }
        if(sum==t){
            System.out.println(t+" is krushnamurty num");
        }
        else{
            System.out.println(t+" is not krushnamurty num");
        }

    }
}
