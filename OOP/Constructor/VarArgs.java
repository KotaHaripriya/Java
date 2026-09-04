package OOP.Constructor;

public class VarArgs {
    void add(int ...number){
        System.out.println("Number of parameters");
        int sum=0;
        for(int n: number){
            sum+=n;
        }
        System.out.println("Addition : "+sum);
    }
    void add(float ...nums){
        System.out.println("Number of parameters");
        float sum=0;
        for(float n:nums){
            sum+=n;
        }
        System.out.println("Addition : "+sum);
    }
    public static void main(String[] args) {
        VarArgs obj = new VarArgs();
        obj.add(1,2,3,4);
        obj.add(1,2,3);
        obj.add(11.1f,11.2f,11.3f,11.4f);
    }
}
