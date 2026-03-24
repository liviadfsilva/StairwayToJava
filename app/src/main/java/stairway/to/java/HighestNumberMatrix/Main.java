package stairway.to.java.HighestNumberMatrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the length of your line in numbers:");
        int lines = scanner.nextInt();

        System.out.println("Choose the length of your columns in numbers:");
        int columns = scanner.nextInt();

        int[][] wholeNumbersMatrix = new int[lines][columns];

        for (int i = 0; i < wholeNumbersMatrix.length; i++) {
            for (int j = 0; j < wholeNumbersMatrix[i].length; j++) {
                System.out.println("Type out a value:");
                wholeNumbersMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int i = 0; i < wholeNumbersMatrix.length; i++) {
            for (int j = 0; j < wholeNumbersMatrix[i].length; j++) {
                System.out.print(wholeNumbersMatrix[i][j] + " ");
            }
            System.out.println();
        }

        int highestNumber = wholeNumbersMatrix[0][0];

        for (int i = 0; i < wholeNumbersMatrix.length; i++) {
            for (int j = 0; j < wholeNumbersMatrix[i].length; j++) {
                if (wholeNumbersMatrix[i][j] > highestNumber) {
                    highestNumber = wholeNumbersMatrix[i][j];
                }
            }
        }

        System.out.println("\nThe highest number is: " + highestNumber);

        scanner.close();
    }
}
