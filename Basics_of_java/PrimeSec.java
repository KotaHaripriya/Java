public class PrimeSec{
    public static void main(String[] args) {
       int n = 167;
       int count=0; 
       for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            count++;
        }
        
       }
       if(count>0){
        System.out.println("not a prime");
       }
       else{
        System.out.println("Prime");
       }

    }
}