package multiDimentionalArray;

public class sumOFdiagonals {
    public static void main(String[] args) {
        int[][] matrix = { { 12, 23, 34 }, { 23, 45, 67 }, { 45, 67, 90 } };
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.printf("sum of diagonal elements: "+sum);
    }
}
