import java.util.Scanner;

public class logika {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite godinu rodjenja");

        int godinaRodjenja = s.nextInt();

        if ( godinaRodjenja % 3 == 0) {
            System.out.println("Pri deljenju sa 3 ostatak je 0");
        } else {

            if ( godinaRodjenja % 3 == 1 )  {
                System.out.println("Pri deljenju sa 3 ostatak je 1");
            } else {
                System.out.println("Pri deljenju sa 3 ostatak je 2");
        }

    }

}
}
