package multiDimentionalArray;

public class matrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1={{1,2},{3,4}};
        int[][] matrix2={{1,2},{3,4}};
        int[][] res=new int[2][2];
        for(int i=0;i<=1;i++){
            for(int j=0;j<=1;j++){
                res[i][j]=0;
                for(int k=0;k<=1;k++){
                    res[i][j]=res[i][j]+matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        for(int i=0;i<=1;i++){
            for(int j=0;j<=1;j++){
                System.out.print(res[i][j]+" ");
                
            }
            System.out.println("\n");
        }
    }
   

}
