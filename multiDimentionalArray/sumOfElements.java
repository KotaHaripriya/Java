package multiDimentionalArray;

public class sumOfElements {
    public static void main(String[] args) {
        int [][] matrix1 ={{12,23,34},{23,56,78}};

        System.out.println("Row sum:");
        
        for(int i=0;i<2;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                sum+=matrix1[i][j];
            }
            System.out.println(sum);
        }

        System.out.println("col sum:");
        for(int j=0;j<3;j++){
            int sum=0;
            for(int i=0;i<2;i++){
                sum+=matrix1[i][j];
            }
            System.out.println(sum);
        }
        
    }

}
