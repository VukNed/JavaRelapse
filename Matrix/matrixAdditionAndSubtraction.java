import java.util.Scanner;

public class matrixAdditionAndSubtraction {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("How many rows?");
        int rows = s.nextInt();

        System.out.println("How many columns?");
        int cols = s.nextInt();

        int matrix1[][] = new int [rows][cols];
        int matrix2[][] = new int [rows][cols];
        int sum[][] = new int [rows][cols];

        System.out.println("Fill in the matrix 1");

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix1[i][j] = s.nextInt();
            }
        }

        System.out.println("Fill in the matrix 2");

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix2[i][j] = s.nextInt();
            }
        }

        System.out.println("Printing matrix1: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Printing matrix2: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Sum of 2 matixes: ");
        for( int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){

                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
