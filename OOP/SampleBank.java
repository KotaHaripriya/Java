package OOP;

public class SampleBank {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.setId(123);
        b1.setBalance(10000);
        b1.setName("Lalit");

        if(b1.getBalance()==-1){
            System.out.println("Invalid user ");
        }
        else{
            System.out.println("Your balance is "+b1.getBalance());
        }

    }
}
