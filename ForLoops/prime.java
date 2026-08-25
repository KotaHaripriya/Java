package ForLoops;

public class prime {
    public static void main(String[] args) {
        int num = 12;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;

            }

        }
        if (isPrime) {
            System.out.println(num + " is Prime number");
        } else
            System.out.println(num + " is not Prime number");
    }
}
