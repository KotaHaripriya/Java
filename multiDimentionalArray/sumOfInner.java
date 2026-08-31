package multiDimentionalArray;

public class sumOfInner {
    public static void main(String[] args) {
        int[][] matrix = {{12,23,45,34},{45,34,56,78},{23,67,4,7},{12,32,45,67}};
        int sum=0;
        int count=0;
        System.out.println("original matrix: ");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.printf("%-4d",matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Inner elements : ");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i!=0&&i!=3&&j!=0&&j!=3){
                    System.out.printf("%-4d",matrix[i][j]);
                    sum+=matrix[i][j];
                    count++;
                }
                
            }
            System.out.println();
        }
        int avg=sum/count;
        System.out.println("sum of elements: "+sum);
        System.out.println("Avg of inner elements: "+avg);

    }
}
