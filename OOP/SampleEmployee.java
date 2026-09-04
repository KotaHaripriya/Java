package OOP;

public class SampleEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpid(101);
        emp.setName("Riya");
        emp.setSalary(100000);
        System.out.println("Id : "+emp.getEmpid());
        System.out.println("Name: "+emp.getName());
        System.out.println("Salary: "+emp.getSalary());
    }
}
