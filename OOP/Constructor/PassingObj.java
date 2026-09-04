package OOP.Constructor;

public class PassingObj {
    String name;
    int age;
    PassingObj(String name,int age){
        this.name=name;
        this.age=age;

    }
    PassingObj compare(PassingObj p){
        if (this.age>p.age) {
            return this;
        }
        else{
            return p;
        }
    }
    public static void main(String[] args) {
        PassingObj p1=new PassingObj("Shekhar" , 23);
        PassingObj p2=new PassingObj("Nitin", 21);
        PassingObj p=p1.compare(p2);
        System.out.println(p.name+" is Elder");
    }
}
