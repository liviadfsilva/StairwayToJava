package stairway.to.java.MultiplicationTable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What multiplication table would you like to generate?");
        int userNumber = scanner.nextInt();

        for(int i = 1; i<11; i++){
            System.out.println(userNumber + " x " + i + " = " + (userNumber * i));
        }

        scanner.close();
    }
}
