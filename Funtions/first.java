package Funtions;

public class first {

    void sayHello(){
        System.out.println("Good Afternoon...");
    }

    void add() {
        int a, b, res;
        a = 34;
        b = 54;
        res = a + b;

        System.out.println("Addition is : " + res);
    }
    void sub(){
        int a,b,res;
        a=34;
        b=54;
        res=a-b;
        System.out.println("Subtraction is : "+res);
    }

    public static void main(String[] args) {
        first obj = new first();
        obj.sayHello();
        obj.add();
        obj.sub();

    }
}
