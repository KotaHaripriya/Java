package OOP.Constructor;

public class MainApp {
    void add(double a, double b) {
        System.out.println("double  parameter : " + (a + b));
    }

    void add(int a, int b) {
       System.out.println("Int parameter : " + (a + b));
   } 

    void add(String a, String b) {
        System.out.println("String Para : " + (a + b));
    }
    void add(char a,char b){
        System.out.println("Char parameter : "+(a+b));
    }
    void add(float a,float b){
        System.out.println("float parameter: "+(a+b));
    }

    public static void main(String[] args) {
        MainApp obj = new MainApp();
        obj.add(17,18);
        obj.add(17.5,18.5);
        obj.add("Hari","priya");
        obj.add('c','h');
        obj.add(12f,13f);


    }
}
