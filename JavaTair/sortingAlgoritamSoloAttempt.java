import java.util.Scanner;

public class sortingAlgoritamSoloAttempt {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("How many numbers");
        int rec = s.nextInt();
        int[] array = new int[rec];

        for(int i=0; i < rec; i++){

            System.out.println("Write a number");
            array[i] = s.nextInt();
        }

        System.out.println("Members of array are: ");
        for (int members: array) {
            System.out.print(members + " ");
        }



        // System.out.println(min);

    }
}
