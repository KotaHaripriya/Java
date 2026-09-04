package OOP.Constructor;

public class Employee {
    private int id;
    private String name;
    private int salary;
    public Employee() {//No Argument Constructor
        this.id=-1;
        this.name="Dummy";
        this.salary=0;

    }
    
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    
}
