package stairway.to.java.BasicOperations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a Math Operation");
        String chosenOperation = scanner.nextLine().toUpperCase();

        MathOperation operation = MathOperation.valueOf(chosenOperation);

        System.out.println("Type the first number");
        int n1 = scanner.nextInt();

        System.out.println("Now type the second number");
        int n2 = scanner.nextInt();

        switch (operation) {
            case MathOperation.SUM:
                System.out.print("The result of your operation is: " + (n1 + n2));
                break;
            case MathOperation.SUBTRACTION:
                System.out.print("The result of your operation is: " + (n1 - n2));
                break;
            case MathOperation.MULTIPLICATION:
                System.out.print("The result of your operation is: " + (n1 * n2));
                break;
            case MathOperation.DIVISION:
                System.out.print("The result of your operation is: " + (n1 / n2));
                break;
        }

        scanner.close();

    }
}
