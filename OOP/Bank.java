package OOP;

public class Bank {
     int id;
     String name;
    int balance;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
     public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
     public void setBalance(int balance){
        this.balance=balance;
    }
    public int getBalance(){
        if (id==123)
            return balance;
        else
            return -1;
    }
}
