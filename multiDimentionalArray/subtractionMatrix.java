package multiDimentionalArray;


public class subtractionMatrix {
    public static void main(String[] args) {
        int [][] matrix1 = {{10,22,33},{23,56,67}};
        int [][] matrix2 = {{12,13,14},{12,34,56}};
        int [][] res =  new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                res[i][j]=matrix1[i][j]-matrix2[i][j];
                System.out.printf("%-4d",res[i][j]);
            }
            System.out.println();
        }
    }
}
