package ForLoops;

public class power {
    public static void main(String[] args) {
        int no = 3,res=1;
        for(int n=5;n>=1;n--){
            res = no*res;
        }
        System.out.println(res+"  ");
    }
}
