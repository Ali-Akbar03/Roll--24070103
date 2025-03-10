import java.util.Scanner;
public class SUM {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[][] Array = new int[2][3];
        int sum= 0;

        System.out.print("Enter the Elements - ");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                Array[i][j]= input.nextInt(); // taking user input 
            }
        }

        for(int i=0; i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.println(Array[i][j]); // it will  show the elements 
            }
        }

        // Summation of elements counter 

        for(int i=0; i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                sum = sum + Array[i][j]; 
            }
        }

        System.out.print("Sum="+sum);

    }
    
}
