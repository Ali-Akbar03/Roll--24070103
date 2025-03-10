import java.util.Scanner;

public class ROTATEMATRIX {
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

        // Rotate the matrix by 90 degrees clockwise
        rotateMatrix(matrix, n);

        // Print the rotated matrix
        System.out.println("Matrix after 90 degrees clockwise rotation:");
        printMatrix(matrix, n);

        // Close scanner
        scanner.close();
    }

    // Method to rotate the matrix by 90 degrees clockwise
    public static void rotateMatrix(int[][] matrix, int n) {
        // Step 1: Transpose the matrix (flip rows and columns)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap matrix[i][j] and matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row (mirror the matrix horizontally)
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                // Swap matrix[i][left] and matrix[i][right]
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
