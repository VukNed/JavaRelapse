import java.util.Arrays;
import java.util.Scanner;

public class exam {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Array lenght?");
        int l = s.nextInt();

        System.out.println("Rows in Matrix?");
        int rows = s.nextInt();

        System.out.println("Columns in matrix?");
        int cols = s.nextInt();
        if ( l*l != rows * cols) {
            System.out.println("Wrong parameters");
        }
        int arr[] = new int[l];

        System.out.println("Fill in the array");
        for(int i=0; i<l; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int matrix[][] = new int[rows][cols];
        int result[][] = new int[rows][cols];
        int transposed [][] =new int[cols][rows];

        System.out.println("Fill in the Matrix");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j]=s.nextInt();
            }
        }

        System.out.println("Your Matrix");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j] + "\t");;
            }
            System.out.println();
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                    result[i][j] += matrix[i][j] * arr[j];
            }
        }
        System.out.println("Your Result");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                transposed[i][j] = result[j][i];
            }
        }
        System.out.println("Transposed");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(transposed[i][j] + "\t");
            }
            System.out.println();
        }



    }

}
