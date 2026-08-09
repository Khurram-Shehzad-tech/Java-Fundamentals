import java.util.Scanner;

public class Practice {

    public int readNumber() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        return number;
    }

    public int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        int number = p.readNumber();
        int result = p.factorial(number);
        System.out.println("Factorial: " + result);
    }
}