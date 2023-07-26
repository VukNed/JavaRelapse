import java.util.Scanner;

public class ponavljanja {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        for ( int i=0; i <10; i++ ) {
            System.out.println("Unesite neki broj");
            int broj = s.nextInt();

            if (broj%2 == 0) {
                System.out.println("Uneli ste paran broj");
            } else {
                System.out.println("Uneli ste neparan broj");
            }

        }

        System.out.println("Program je zavrsen!");

    }
}
