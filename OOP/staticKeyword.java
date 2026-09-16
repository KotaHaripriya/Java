package OOP;

class Student{
    int id;
    String name;
    static String college_name;

    Student(){}
    public Student(int id,String name){
        super();
        this.id=id;
        this.name=name;
    }
    @Override
    public String toString() {
        return "Student [College Name ="+college_name+"id=" + id + ", name=" + name + "]";
    }

}

public class staticKeyword {
    public static void main(String[] args) {
        Student.college_name = "Fortune Cloud";
        Student s1 = new Student(1, "ABC");
        Student s2 = new Student(2, "PQR");
        Student s3 = new Student(3, "XYZ");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
