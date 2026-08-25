package ForLoops;

public class NoSeries {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }
        System.out.println("\n");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + " ");
        }
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        System.out.println("Sum is "+sum);
        System.out.println("\n");
        for(int i=1,j=5;i<=5;i++,j--){
            if(i==j)
                continue;
            System.out.println(i+" , "+j);
        }
        }
    }

