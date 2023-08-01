import java.util.Scanner;

public class sortingAlgoritamSoloAttempt {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("How many numbers");
        int rec = s.nextInt();
        int[] array = new int[rec];

        // filling in the array
        for(int i=0; i < rec; i++){

            System.out.println("Write a number");
            array[i] = s.nextInt();
        }

        // sorting algorithm
        for (int k=0; k<array.lenght; k++){
            for (int l=0; l<array.lenght; l++){

                int temp = 0;
                if (array[k] > array [l]) {
                    temp = array[k];
                    array[k] = array[l];
                    array[l] = temp;
                }

            }

            System.out.println(array[k]);

        }
        

        // System.out.println("Members of array are: ");
        // for (int members: array) {
        //     System.out.print(members + " ");
        }
    }
