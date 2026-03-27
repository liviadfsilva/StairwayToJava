package stairway.to.java.TryCatchNumber;

import java.util.Scanner;

//     Crie um programa que solicite ao usuário para digitar uma
// frase ou número, realize a leitura e utilize um bloco
// try-catch para verificar se a string representa um número
// inteiro válido.

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number or a sentence: ");
        String input = scanner.nextLine();

        try {
            int isWholeNumber = Integer.parseInt(input);
            System.out.println(isWholeNumber + " is a whole number.");
            
        } catch (Exception e) {
            System.out.println("This isn't a whole number.");
        }
        finally{
            System.out.println("Goodbye!");
            scanner.close();
        }
    }
}
