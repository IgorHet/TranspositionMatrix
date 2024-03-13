import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість рядків (M):");
        int m = scanner.nextInt();

        System.out.println("Введіть кількість стовпців (N):");
        int n = scanner.nextInt();

        int[][] originalMatrix = new int[m][n];
        int[][] transposedMatrix = new int[n][m];

        System.out.println("Введіть елементи матриці:");

        // Заповнення та виведення оригінальної матриці
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                originalMatrix[i][j] = scanner.nextInt();
            }
        }

        // Транспонування матриці
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }

        // Виведення транспонованої матриці
        System.out.println("Транспонована матриця:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
