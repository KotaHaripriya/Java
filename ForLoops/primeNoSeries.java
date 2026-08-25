package ForLoops;

public class primeNoSeries {
    public static void main(String[] args) {

        int i = 2;
        for (; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " ");
          }

        }
        
    }
}
