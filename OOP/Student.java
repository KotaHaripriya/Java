package OOP;

public class Student {
    int id;
    String name;

    
    int marks;

    void input(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    void output(){
        System.out.println("Id := "+id);
        System.out.println("Name := "+name);
        System.out.println("Marks := "+marks );
    }
}
