package OOP.Constructor;

public class SampleEmployee {
    public static void main(String[] args) {
        Employee emp=new Employee();
        System.out.println(emp);
        Employee emp1=new Employee(1,"Sahil",40000);
        System.out.println(emp1);

        Employee emp2=new Employee(12,"Riya");
        System.out.println(emp2);

        Employee emp3=new Employee(4,"Kavya");
        System.out.println(emp3);


    }
}
