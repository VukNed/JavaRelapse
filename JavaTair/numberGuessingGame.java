import java.util.Scanner;
import java.util.Random;

public class numberGuessingGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Random random = new Random();

        System.out.println("You have 5 guesses to find a number from 1 to 100");

        int randomInt= random.nextInt(100);

        //this sout was used to check if randomInt is working
        //System.out.println(randomInt);

        for (int i=0; i < 5; i++) {
            System.out.println("Make your guess");
            int guess = s.nextInt();

            //it has to begin with 4, because the 1st value for i is 0
            int trial = 4 - i;

            if (guess < randomInt) {
                System.out.println("Aim higher, you have " + trial + " guesses left");
            } else {
                if (guess > randomInt) {
                System.out.println("Aim lower, you have " + trial + " guesses left");
                } else {
                System.out.println("Thats the number!");
                break;
                }
            }
                // if i use single = java reads it as boolean
                if (trial == 0) {
                    System.out.println("Game Over");
                }

        }

    }
}
