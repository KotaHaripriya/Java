public class sum_of_digits {
    public static void main(String[] args) {
        int no=12345 , rem , sum = 0 , count = 0;
        while(no>0){
            rem = no%10;
            sum+=rem;
            count++;
            no = no/10;
        }
        System.out.println("No of digits : "+count);
        System.out.println("Sum of digits : "+sum);
    }
}
