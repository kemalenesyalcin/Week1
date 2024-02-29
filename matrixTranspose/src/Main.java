import java.util.Scanner;

public class Main {

    public static int[][] transposeMatrix(int[][] matrix) {
        int rowIndex = matrix.length;
        int colIndex = matrix[0].length;
        int[][] transposeMatrix = new int[colIndex][rowIndex];

        for (int row = 0; row < rowIndex; row++) {
            for (int col = 0; col < colIndex; col++) {
                transposeMatrix[col][row] = matrix[row][col];
            }
        }
        return transposeMatrix;
    }

    public static int[][] promptMatrix() {
        Scanner input = new Scanner(System.in);
        int rowIndex;
        int colIndex;

        do {
            System.out.print("Please enter the number of rows of the matrix: ");
            rowIndex = input.nextInt();
            System.out.print("Please enter the number of columns of the matrix: ");
            colIndex = input.nextInt();

            if (rowIndex > 0 && colIndex > 0) {
                break;
            } else {
                System.out.println("Both row and column indices must be greater than 0. Please try again.");
            }
        } while (true);

        int[][] matrix = new int[rowIndex][colIndex];

        for (int row = 0; row < rowIndex; row++) {
            for (int col = 0; col < colIndex; col++) {
                System.out.print("Please enter the value for row " + (row + 1) + " and column " + (col + 1) + ": ");
                matrix[row][col] = input.nextInt();
            }
        }
        System.out.println();
        return matrix;
    }

    public static void printMatrix(int[][] matrix, String name) {
        System.out.println(name + " Matrix:");
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = promptMatrix();
        printMatrix(matrix, "A");
        printMatrix(transposeMatrix(matrix), "A^T");
    }
}
