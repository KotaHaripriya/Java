package Conditional;

public class DivisiblityCheck {
    public static void main(String[] args) {
        int i = 1 ;
        for (;i<=1000;i++){
            if(i%5==0 && i%11==0 ){
                System.out.println(i);
            }
        }
    }
}
