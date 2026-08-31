package multiDimentionalArray;

public class row_wise_greater {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{3,4,5}};
        for(int i=0;i<2;i++){
            int max=0;
            for(int j=0;j<3;j++){
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                }
            }
            System.out.println(max);
        }
    }
}
