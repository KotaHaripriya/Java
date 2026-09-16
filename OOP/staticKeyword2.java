package OOP;
class Code{
    int data;
    static int count;
    Code(){}
    Code(int data){
        this.data=data;
        count++;
    }
    void display(){
        System.out.println("Code: "+data+" , count : "+count);
    }
    static void showCount(){
        System.out.println("Total Objects created : " +count);
    }

}
public class staticKeyword2 {

    static void show(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        show();
        Code c1 = new Code(100);
        c1.display();
        Code c2 = new Code(200);
        c2.display();
        Code c3 = new Code(300);
        c3.display();
        Code.showCount();

         
    }
    
}
