package multiDimentionalArray;

public class lowerTriangularMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,0,0},{4,5,0},{6,7,9}};
         boolean is_upper=true;
         for(int i=0;i<3;i++){
            for(int j=0;i<j;j++){
                if(matrix[i][j]!=0){
                    is_upper=false;
                    break;
                }
            }
         }
         if(is_upper){
            System.out.println("Matrix is lower triangular");
         }
         else{
            System.out.println("Matrix is not lower triangular");
         }

    }

    
}
