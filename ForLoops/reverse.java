package ForLoops;

public class reverse {
    public static void main(String[] args) {
        int no=463,rem,rev=0;
        for(;no>0;){
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        System.out.println("Reverse := "+rev);
    }
}
