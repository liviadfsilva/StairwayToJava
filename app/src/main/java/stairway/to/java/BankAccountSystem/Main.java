package stairway.to.java.BankAccountSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        BankAccount bankAccount1 = new BankAccount("Lily", 013, 0);
        BankAccount bankAccount2 = new BankAccount("Breno", 007, 0);

        boolean menu = true;

        while (menu) {
            System.out.println("Choose an option below:\n 1. Deposit\n 2. Withdrawal\n 3. Transfer\n 4. Check Balance\n 5. Quit");
            int option = scanner.nextInt();
            System.out.println();

            if (option == 1) {
                System.out.println("How much would you like to deposit?");
                double value = scanner.nextDouble();
                bankAccount1.makeDeposit(value);
                System.out.println();
            }
            else if(option == 2){
                System.out.println("How much would you like to withdraw?");
                double value = scanner.nextDouble();
                bankAccount1.withdrawal(value);
                System.out.println();
            }
            else if(option == 3){
                System.out.println("How much would you like to transfer?");
                double value = scanner.nextDouble();
                bankAccount1.transfer(bankAccount2, value);
                System.out.println();
            }
            else if(option == 4){
                bankAccount1.checkBalance();
                System.out.println();
            }
            else if(option == 5){
                System.out.println("Goodbye!");
                menu = false;
            }                   
            else {
                System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
