package Funtions;

public class parametrizedfuntion {
    void factorial1(int n) {
        int f = 1, t;
        t = n;
        while (n >= 1) {
            f = f * n;
            n--;
        }
        System.out.println("Factorial of " + t + " : " + f);

    }

    public static void main(String[] args) {
        parametrizedfuntion obj = new parametrizedfuntion();
        obj.factorial1(11);
    }
}
