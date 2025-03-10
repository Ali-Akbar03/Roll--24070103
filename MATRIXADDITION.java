import java.util.Scanner;

public class MATRIXADDITION {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int sum[][] = new int[2][2];

        // Input for Matrix A
        System.out.println("Enter the elements for matrix A:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                A[i][j] = input.nextInt();
            }
        }

        // Display Matrix A
        System.out.println("Matrix A:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // Input for Matrix B
        System.out.println("Enter the elements for matrix B:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                B[i][j] = input.nextInt();
            }
        }

        // Display Matrix B
        System.out.println("Matrix B:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        // Sum of Matrices A and B
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        // Display Sum Matrix
        System.out.println("Matrix A + B:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        
        input.close();
    }
}