import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        
        int[] array = new int[3];
        // [0, 1, 2]
        int sum = 0;

        Scanner s = new Scanner(System.in);

        for (int i=0; i<3; i++) {
            System.out.println("Type next number: ");
            array[i] = s.nextInt();

            sum += array[i];

        }
        
        double average = sum / 3.0;
        System.out.println("Average is: " + average);
    }
}
