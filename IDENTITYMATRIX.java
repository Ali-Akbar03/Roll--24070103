import java.util.Scanner;

public class IDENTITYMATRIX {
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the size of the matrix
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();

        // Declare the matrix (2D array)
        int[][] matrix = new int[n][n];

        // Get user input for the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Check if the matrix is an identity matrix
        if (isIdentityMatrix(matrix, n)) {
            System.out.println("The matrix is an identity matrix.");
        } else {
            System.out.println("The matrix is not an identity matrix.");
        }

        // Close scanner
        scanner.close();
    }

    // Method to check if the matrix is an identity matrix
    public static boolean isIdentityMatrix(int[][] matrix, int n) {
        // Check all elements of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check diagonal elements
                if (i == j) {
                    if (matrix[i][j] != 1) {
                        return false; // Diagonal elements must be 1
                    }
                } else {
                    // Check non-diagonal elements
                    if (matrix[i][j] != 0) {
                        return false; // Non-diagonal elements must be 0
                    }
                }
            }
        }
        return true; // If all checks passed, it's an identity matrix
    }
}
