package OOP;

public class staticBlock {
    static{
        System.out.println("Static Block");
    }
    
    {
        System.out.println("Object created");
    }
    public static void main(String[] args) {
        staticBlock s1 = new staticBlock();
        staticBlock s2 = new staticBlock();


    }
}
