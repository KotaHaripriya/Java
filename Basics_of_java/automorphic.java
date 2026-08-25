public class automorphic {
    // automorphic : is no whose square ends with itself
    public static void main(String[] args) {
        int no = 6, sq;
        boolean isautomorphic = true;
        sq = no*no;
        while(no>0){
            if(no%10!=sq%10){
                isautomorphic=false;
                break;
            }
            no=no/10;
            sq=sq/10;
        }
        if(isautomorphic){
            System.out.println( "it is automorphic"   );
        }

        else{
            System.out.println("is not automorphic");
        }
    }
    
    
        
}
