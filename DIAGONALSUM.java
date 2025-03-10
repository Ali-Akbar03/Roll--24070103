import java.util.Scanner;

public class DIAGONALSUM {
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the size of the matrix (n x n)
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

        // Variables to store the sum of diagonals
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        // Calculate the sum of the main diagonal and secondary diagonal
        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i]; // Sum for main diagonal
            secondaryDiagonalSum += matrix[i][n - 1 - i]; // Sum for secondary diagonal
        }

        // Output the result
        System.out.println("Sum of the main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);

        // Close scanner
        scanner.close();
    }
}
