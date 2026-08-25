package Loops;

public class krisnamurtinum {
    public static void main(String[] args) {
        int n = 541, rem, sum = 0, t, f;
        t = n;
        while (n > 0) {

            rem = n % 10;
            f = 1;
            while (rem >= 1) {
                f = f * rem;
                rem--;
            }
            sum += f;
            n = n / 10;

        }
        System.out.println(sum);
        if (t == sum)
            System.out.println(t + " is krushnamurty number");
        else
            System.out.println(t + " is not a krushnamurty number");
    }
}
