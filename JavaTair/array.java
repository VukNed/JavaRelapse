import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Whats the lenght of the array?");
        int lenght = s.nextInt();

        int[] array = new int[lenght];
        // [0, 1, 2]
        int sum = 0;

 

        for (int i=0; i<lenght; i++) {
            System.out.println("Type next number: ");
            array[i] = s.nextInt();

            sum += array[i];

        }
        
        double average = sum / lenght;
        System.out.println("Average is: " + average);
    }
}
