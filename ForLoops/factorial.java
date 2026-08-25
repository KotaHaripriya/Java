package ForLoops;

public class factorial {
    public static void main(String[] args) {
        int f=1;
        
        
        for(int n = 5; n >= 1; n--){
            f = f*n;
        }
        System.out.println("Factorial of 5 is "+f);
    }
}
