package recursion;

public class factorial {
    int fact(int n){
        int f=1;
        if(n==1)
            return 1;
        else
            f=n*fact(n-1);
        return f;
    }
    public static void main(String[] args) {
        factorial obj = new factorial();
        int no=5;
        System.out.println(obj.fact(no));
    }
}
