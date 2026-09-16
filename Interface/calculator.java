package Interface;

public class calculator implements arith1,arith2 {
    public int add(int a,int b){
        return a+b;
    }
    @Override 
    public int sub(int a,int b){
        return a-b;
    }
    @Override 
    public int mult(int a,int b){
        return a*b;
    }
    @Override 
    public int div(int a,int b){
        return a/b;
    }

}
