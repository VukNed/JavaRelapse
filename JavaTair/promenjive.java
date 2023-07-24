import java.util.Scanner;

public class promenjive {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Godina upisa studenta: ");

        int godinaUpisa = s.nextInt();
        int godinaDiplomiranja = godinaUpisa + 4;
        
        System.out.println("Godina diplomiranja je: " + godinaDiplomiranja);

    }
}
