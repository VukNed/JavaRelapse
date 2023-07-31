import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        
        int b1, b2, b3;
        
        Scanner s = new Scanner(System.in);

        System.out.println("First number");
        b1 = s.nextInt();

        System.out.println("First number");
        b2 = s.nextInt();

        System.out.println("First number");
        b3 = s.nextInt();

        int srednjaVrednost = (b1 + b2 + b3) / 3;
        System.out.println("Average is " + srednjaVrednost);
    }
}
