package Funtions;

public class alternatePrime {
    boolean isPrime(int n) {
        int i = 2;
        boolean prime = true;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                prime = false;
                break;
            }
            i++;
        }
        return prime;
    }

    public static void main(String[] args) {
        alternatePrime obj = new alternatePrime();
        int no = 1;
        boolean toggle = true;
        while (no <= 100) {
            if (obj.isPrime(no)) {
                if (toggle) {
                    System.out.print(no + " ");

                }
                toggle = !toggle;
            }
            no++;
        }

    }
}
