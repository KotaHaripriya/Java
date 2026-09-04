package OOP;

public class SampleEncapsulation {
    public static void main(String[] args) {
        Encapsulation enp = new Encapsulation();
        enp.setId(1);
        enp.setName("Sharad");
        enp.setMarks(98);
        System.out.println("Id: "+enp.getId());

        Encapsulation enp1 = new Encapsulation();
        enp1.setId(2);
        enp1.setName("Riya");
        enp1.setMarks(98);
        System.out.println("Id: "+enp1.getId());
    }
    
    

}
