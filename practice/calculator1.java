import java.util.Scanner;

class Calculator {

    int calculate(char i, int n, int m) {

        if (i == 'a') {
            return n + m;
        }
        else if (i == 'b') {
            return n - m;
        }
        else if (i == 'c') {
            return n * m;
        }
        else if (i == 'd') {
            if (m == 0) {
                System.out.println("m can't be zero");
                return 0;
            }
            else {
                return n / m;
            }
        }
        else {
            System.out.println("Invalid choice");
            return 0;
        }
    }
}

public class calculator1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(
            "Enter 'a' for addition, 'b' for subtraction, " +
            "'c' for multiplication and 'd' for division"
        );

        char i = input.next().charAt(0);

        System.out.println("Enter any two integers");

        int n = input.nextInt();
        int m = input.nextInt();

        Calculator c = new Calculator();

        int result = c.calculate(i, n, m);

        System.out.println("Result: " + result);
    }
}