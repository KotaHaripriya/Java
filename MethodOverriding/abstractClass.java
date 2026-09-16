package MethodOverriding;
abstract class RBIBank{
    int balance;
    public RBIBank(){

    }
    public RBIBank(int balance){
        this.balance=balance;

    }
    abstract void with(int amt);
    abstract void depo(int amt);
    void showBalance(){
        System.out.println("Balance : "+balance);
    }
}
class HDFC extends RBIBank{
    public HDFC(){

    }
    public HDFC (int balance){
        super(balance);
    }
    @Override 
    void with(int amt){
        balance=balance-amt;
    }
    @Override 
    void depo(int amt){
        balance=balance+amt;
    }
}
class ICIC extends RBIBank{
    public ICIC(){

    }
    public ICIC (int balance){
        super(balance);
    }
    @Override 
    void with(int amt){
        balance=balance-amt;
    }
    @Override 
    void depo(int amt){
        balance=balance+amt;
    }
}
public class abstractClass {
    public static void main(String[] args) {
        RBIBank r1= new HDFC(4000);
        r1.with(3000);
        r1.showBalance();
    }
}
