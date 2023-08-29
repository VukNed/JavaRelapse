import java.util.Scanner;

public class memory {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Number of rows?");
        int rows = s.nextInt();
        
        System.out.println("Number of columns?");
        int cols = s.nextInt();

        int matrix1[][] = new int [rows] [cols];
        int matrix2[][] = new int [rows] [cols];
        int sum[][] = new int [rows] [cols];
        int sub[][] = new int [rows] [cols];

        System.out.println("Fill in the 1st matrix");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix1[i][j]= s.nextInt();
            }
        }

        System.out.println("Fill in the 2nd matrix");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix2[i][j]= s.nextInt();
            }
        }

        System.out.println("Your 1st matrix: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    System.out.print(matrix1[i][j] + "\t");
                }
                System.out.println();
            }

        System.out.println("Your 2nd matrix: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    System.out.print(matrix2[i][j] + "\t");
                }
                System.out.println();
            }

        //System.out.println("Summary: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

        //System.out.println("Subtraction: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    sub[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        System.out.println("Summary: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    System.out.print(sum[i][j] + "\t");
                }
                System.out.println();
            }

        System.out.println("Subtraction: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    System.out.print(sub[i][j] + "\t");
                }
                System.out.println();
            }

    }

}
