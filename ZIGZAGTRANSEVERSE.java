import java.util.Scanner;

public class ZIGZAGTRANSEVERSE {
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the size of the matrix
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

        // Traverse the matrix in zigzag pattern
        printZigzagTraversal(matrix, rows, cols);

        // Close scanner
        scanner.close();
    }

    // Method to traverse the matrix in zigzag pattern
    public static void printZigzagTraversal(int[][] matrix, int rows, int cols) {
        // Traverse each row
        for (int i = 0; i < rows; i++) {
            // If the row index is even, traverse from left to right
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            // If the row index is odd, traverse from right to left
            else {
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println(); // New line after printing zigzag elements
    }
}