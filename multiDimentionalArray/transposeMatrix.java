package multiDimentionalArray;

public class transposeMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,3},{2,4},{5,7}};
        int row=3;
        int col=2;
        System.out.println("Original matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("%-4d",matrix[i][j]);
            }
            System.out.println();
        }
        row=2;
        col=3;
        int [][] res = new int[row][col];
        for(int j=0;j<row;j++ ){
            for(int i=0;i<col;i++){
                res[j][i]=matrix[i][j];
                System.out.printf("%-4d",res[j][i]);
            }
            System.out.println();
        }

    }
}
