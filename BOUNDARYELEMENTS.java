import java.util.Scanner;

public class BOUNDARYELEMENTS {
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the size of the matrix (rows and columns)
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Declare the matrix (2D array)
        int[][] matrix = new int[rows][cols];

        // Get user input for the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the boundary elements of the matrix
        printBoundaryElements(matrix, rows, cols);

        // Close scanner
        scanner.close();
    }

    // Method to print boundary elements of the matrix
    public static void printBoundaryElements(int[][] matrix, int rows, int cols) {
        // Print the first row
        for (int i = 0; i < cols; i++) {
            System.out.print(matrix[0][i] + " ");
        }

        // Print the last column, excluding the first and last element of the row
        for (int i = 1; i < rows; i++) {
            System.out.print(matrix[i][cols - 1] + " ");
        }

        // Print the last row, if it's not the same as the first row
        if (rows > 1) {
            for (int i = cols - 2; i >= 0; i--) {
                System.out.print(matrix[rows - 1][i] + " ");
            }
        }

        // Print the first column, excluding the first and last element of the row
        if (cols > 1) {
            for (int i = rows - 2; i > 0; i--) {
                System.out.print(matrix[i][0] + " ");
            }
        }

        System.out.println(); // New line after printing boundary elements
    }
}
