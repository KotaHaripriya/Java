public class fibonacci {
    public static void main(String[] args) {
        int f0=0,f1=1,f2,count=3;
        System.out.println(f0+" "+f1+" ");
        while(count<=10){
            f2 =f0+f1;
            System.out.println(f2+" ");
            f0=f1;
            f1=f2 ;
            count++;
        }
    }
}
