import java.util.Scanner;

public class cas2 {
    
    public static void main(String[] args) {
        
        int[] nizA = {1, 12, -4, 7, 8, 11, 49};

        int[] nizB = new int[5];
        nizB[0] = 18;
        nizB[1] = 3;
        nizB[2] = 2;
        nizB[3] = 45;
        nizB[4] = 65;

        for (int index=0; index<nizA.length; index++ ){
            int element = nizA[index];
            System.out.println(element);
        }
        for (int element : nizB) {
            System.out.println(element);
        }
        System.out.println("Unesite elemente niza 1 po 1");
        Scanner s = new Scanner(System.in);

        for (int index=0; index<nizB.length; index++ ) {
            System.out.println("Unesite vrednost " + index);
            int vrednost = Math.abs(s.nextInt());
            s.nextLine();
            nizB[index] = vrednost;
        }
        int vrednostKojuTrazimo = 7;
        int indexElementaUNizu = -1;
        for (int index=0; index<nizA.length; index++ ) {
            if(nizA[index] == vrednostKojuTrazimo) {
                indexElementaUNizu = index;
                break;
            }
        }
        if(indexElementaUNizu == -1){
            System.out.println("Nismo nasli tu vrednost");
        } else {
            System.out.println("vrednost je nadjena na " + indexElementaUNizu);
        }

        double[] koreni = new double[nizB.length];
        for(int index = 0; index < nizB.length; index++){
            koreni[index] = Math.sqrt(nizB[index]);
        }
        double[] filtriraniTemp = new double[koreni.length];
        int kolikoSmoSadrzali = 0;
        for (int index = 0; index < koreni.length; index++) {
            if(koreni[index]<4.0) {
                filtriraniTemp [kolikoSmoSadrzali] = koreni[index];
                kolikoSmoSadrzali++;
            }
        }
        double[] filtrirani =new double[kolikoSmoSadrzali];
        for( int i=0; i<kolikoSmoSadrzali; i++){
            filtrirani[i] = filtriraniTemp[i];
        }
    }

}
