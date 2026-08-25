package ForLoops;

public class palindrome {
    public static void main(String[] args) {
        int num=135,rem,t,rev=0;
        t=num;
        for(;num>0;){
            rem = num%10;
            rev = rev*10+rem;
            num=num/10;
        }
        if(t==rev){
            System.out.println(t+" is palindrome no");
        }
        else{
            System.out.println(t+" is not palindrome no");
        }
    }
}
