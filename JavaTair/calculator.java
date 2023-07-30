import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Input first number");
        int a = s.nextInt();

        System.out.println("Input second number");
        int b = s.nextInt();

        System.out.println("Choose your fighter + - * / ");
        char operation = s.next().charAt(0);
        
        switch (operation) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
        }
        // for testing the scanner
        // System.out.println(operation);
        // System.out.println(a+ ", " +b);
        // 

    }
}
