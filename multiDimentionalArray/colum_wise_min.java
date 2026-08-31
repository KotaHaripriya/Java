package multiDimentionalArray;

public class colum_wise_min {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 8, 9, 10 }, { 12, 13, 14, 15 }, { 16, 17, 18, 19 } };
        for (int j = 0; j < 4; j++) {
            int min=matrix[0][j];
            for (int i = 0; i < 4; i++) {
               
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }

            }
            System.out.println(min);

        }
    }
}
