import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = s.nextInt();

        System.out.println("Enter number of columns: ");
        int cols = s.nextInt();

        //2d array
        int data[][] = new int[rows][cols];

        System.out.println("Fill in the matrix");

        for (int i=0; i < rows; i++){
            for(int j=0; j<cols; j++){
                data[i][j] = s.nextInt();
            }
        }

        //printing the matrix
        for (int i=0; i < rows; i++){
            for(int j=0; j<cols; j++){
                //System.out.println("bilo sta");
               System.out.println(data[i][j] + "\t");
            }
        }

    }
}
