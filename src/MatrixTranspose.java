import java.util.Random;
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введіть кількість рядків (M):");
        int m = scanner.nextInt();

        System.out.println("Введіть кількість стовпців (N):");
        int n = scanner.nextInt();

        int[][] originalMatrix = new int[m][n];
        int[][] transposedMatrix = new int[n][m];

        System.out.println("Оригінальна матриця:");

        // Заповнення оригінальної матриці випадковими числами та транспонування
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                originalMatrix[i][j] = random.nextInt(100); // Випадкове число від 0 до 99
                System.out.print(originalMatrix[i][j] + " ");
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
            System.out.println();
        }

        System.out.println("Транспонована матриця:");
        printMatrix(transposedMatrix);
    }

    // Метод для виведення матриці
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
