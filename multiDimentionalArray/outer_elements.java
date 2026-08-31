package multiDimentionalArray;

public class outer_elements {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 7, 8, 9, 10 }, { 11, 12, 13, 14 } };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-4d", matrix[i][j]);//%d :prints elements 
                //4 gives it width of 4 spaces
                //- aglins it to left
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i==0||i==3||j==0||j==3)
                    System.out.printf("%-4d",matrix[i][j]);//%d :prints elements 
                //4 gives it width of 4 spaces
                //- aglins it to left
                else
                    System.out.printf("%-4s","");

            }
            System.out.println();
            
        }
    
            

    }
}
