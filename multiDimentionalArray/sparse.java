package multiDimentionalArray;

public class sparse {
    public static void main(String[] args) {
        int count = 0;
        int total_elements = 0;
        int[][] matrix = { { 1, 2, 3, 0 }, { 0, 0, 0, 0 }, { 3, 0, 0, 7 }, { 12, 0, 0, 0 } };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-4d", matrix[i][j]);
                total_elements++;
                if (matrix[i][j] == 0)
                    count++;
            }
            System.out.println();
        }
        if (count > total_elements / 2) {
            System.out.println("It is sparse matrix");
        } else {
            System.out.println("It is not sparse matrix");
        }
    }
}
