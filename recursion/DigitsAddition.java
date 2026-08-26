package recursion;

public class DigitsAddition {
    int digitAdd(int no){
        int sum=0;
        if(no==0){
            return 0;

        }
        else{
            sum=no%10+digitAdd(no/10);

        }
        return sum;
    }
    public static void main(String[] args) {
        DigitsAddition obj=new DigitsAddition();
        int sum=obj.digitAdd(12345);
        System.out.println("Digits Addition : "+sum);
    }
}
