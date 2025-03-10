import java.util.Scanner;

public class SSYMMITRIC {
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the size of the matrix
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();

        // Declare the matrix (2D array)
        int[][] matrix = new int[n][n];

        // Get user input for the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Variable to track symmetry status
        boolean isSymmetric = true;

        // Check if the matrix is symmetric
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Compare matrix[i][j] with matrix[j][i]
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;  // If any element doesn't match its transpose
                    break; // No need to check further, we found a mismatch
                }
            }
            if (!isSymmetric) {
                break; // Exit the outer loop as well
            }
        }

        // Output result using a one-liner ternary operator
        System.out.println(isSymmetric ? "The matrix is symmetric." : "The matrix is not symmetric.");

        scanner.close(); // Close scanner
    }
}
