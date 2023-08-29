import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("How many rows?");
        int rows = s.nextInt();

        System.out.println("How many cols?");
        int cols = s.nextInt();

        int matrix[][] = new int[rows][cols];
        int transpose[][] = new int[cols][rows];

        System.out.println("Fill in the matrix");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = s.nextInt();
            }
        }

        System.out.println("Printing the matrix");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Creating the transposed matrix");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Printing the transposed matrix");
        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
