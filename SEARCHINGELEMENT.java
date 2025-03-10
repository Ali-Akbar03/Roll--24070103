import java.util.Scanner;

public class SEARCHINGELEMENT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initialize the 2D array
        int[][] array = new int[rows][cols];

        // Input values for the 2D array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Input the number to search
        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();

        // Search for the number in the 2D array
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == target) {
                    System.out.println("Number " + target + " found at position: (" + i + ", " + j + ")");
                    found = true;
                    break; // Exit the loop once the number is found
                }
            }
            if (found) break;
        }

        // If the number is not found
        if (!found) {
            System.out.println("Number " + target + " not found in the array.");
        }
    }
}
