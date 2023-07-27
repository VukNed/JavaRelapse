import java.util.Scanner;

public class ciklus {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int izbor = -1;

        while ( izbor != 0 ) {
            System.out.println("Unesite 0 da prekionete problem: ");
            izbor = s.nextInt();
            s.nextLine();
        }
        System.out.println("Kraj rada programa.");
    }
}
