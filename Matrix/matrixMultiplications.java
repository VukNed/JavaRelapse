import java.util.Scanner;

public class matrixMultiplications {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of rows in first matix");
        int rowsInFirst = s.nextInt();

        System.out.println("Enter the number of cols in first matix and rows in second Matrix");
        int colsInFirstAndRowsInSecond = s.nextInt();

        System.out.println("Enter the number of cols second Matrix");
        int colsInSecond = s.nextInt();

        int matrix1[][] = new int[rowsInFirst][colsInFirstAndRowsInSecond];
        int matrix2[][] = new int[colsInFirstAndRowsInSecond][colsInSecond];
        int result[][] = new int[rowsInFirst][colsInSecond];

        System.out.println("Enter the data for first matrix");

        for(int i=0; i<rowsInFirst; i++){
            for(int j=0; j<colsInFirstAndRowsInSecond; j++){
                matrix1[i][j]= s.nextInt();
            }
        }

        System.out.println("Enter the data for second matrix");

        for(int i=0; i<colsInFirstAndRowsInSecond; i++){
            for(int j=0; j<colsInSecond; j++){
                matrix2[i][j]= s.nextInt();
            }
        }

        System.out.println("Printing first matrix");
        for(int i=0; i<rowsInFirst; i++){
            for(int j=0; j<colsInFirstAndRowsInSecond; j++){
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Printing second matrix");
        for(int i=0; i<colsInFirstAndRowsInSecond; i++){
            for(int j=0; j<colsInSecond; j++){
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println();
        }
        //time to multiply
        for(int i=0; i<rowsInFirst; i++){
            for(int j=0; j<colsInSecond; j++){
                for(int k=0; k<colsInFirstAndRowsInSecond; k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        //printing result
        System.out.println("Printing result");
        for(int i=0; i<rowsInFirst; i++){
            for(int j=0; j<colsInSecond; j++){
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
