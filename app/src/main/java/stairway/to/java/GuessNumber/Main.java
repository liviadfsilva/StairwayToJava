package stairway.to.java.GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int userGuess;

        Random random = new Random();
        number = random.nextInt(7);

        do{
            System.out.println("Guess the number:");
            userGuess = scanner.nextInt();

            if (userGuess > number) {
                System.out.println("The number is smaller.");
            } else if (userGuess < number){
                System.out.println("The number is bigger.");
            }
        } while (userGuess != number);
        System.out.println(number + " is the right number!");

        scanner.close();
    }
}
