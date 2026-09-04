package OOP;

public class Employee {
    private int empid;
    private String name;
    private int salary;

    public void setEmpid(int empid){
        this.empid=empid;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getEmpid(){
        return this.empid;
    }
    public String getName(){
        return this.name;
    }
    public int getSalary(){
        return this.salary;
    }


}
