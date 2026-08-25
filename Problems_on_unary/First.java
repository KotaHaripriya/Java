package Problems_on_unary;

public class First {
    public static void main(String[] args) {
        int i = 3, j = 4, k = 2, res;
        res = ++i / j + k++ * j++ + --k + --i - j--;
        System.out.println("res:= " + res);
        System.out.println("i:= " + i);
        System.out.println("j:= " + j);
        System.out.println("k:= " + k);

    }
}
