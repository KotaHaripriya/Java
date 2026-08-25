package ForLoops;

public class Harshad {
    public static void main(String[] args) {
        int no = 30,rem,sum=0,t;
        t=no;
        for(;no>0;){
            rem=no%10;
            sum+=rem;
            no=no/10;
        }
        if(t%sum==0){
            System.out.println(t+" is harshad(niven) no");
        }
        else{
            System.out.println(t+" is not harshad(niven) no");
        }
    }
}
