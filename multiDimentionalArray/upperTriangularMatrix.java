package multiDimentionalArray;

public class upperTriangularMatrix {
    public static void main(String[] args) {
         int [][] matrix = {{1,2,3},{0,5,6},{0,0,9}};
         boolean is_upper=true;
         for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                if(matrix[i][j]!=0){
                    is_upper=false;
                    break;
                }
            }
         }
         if(is_upper){
            System.out.println("Matrix is upper triangular");
         }
         else{
            System.out.println("Matrix is not upper triangular");
         }

    }

}
