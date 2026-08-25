public class armstrong {
    public static void main(String[] args) {
        int no = 54748, rem, t, count = 0, sum = 0;
        t = no;
        while (no > 0) {
            rem = no % 10;
            count++;
            no = no / 10;
        }
        no = t;
        while (no > 0) {
            rem = no % 10;
            sum += (int) Math.pow(rem, count);
            no = no / 10;
        }
        if(t==sum){
            System.out.println(t+" is a armstrong");
        }
        else{
            System.out.println(t+" is not a armstrong");
        }
    }
}
