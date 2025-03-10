import java.util.Scanner;

public class ARRAY {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[][] Array = new int[2][3];
        System.out.print("Enter the elements ");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                Array[i][j]= input.nextInt();
            }
        }

        for(int i=0; i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.println(Array[i][j]);
            }
        }
    }
    
}
