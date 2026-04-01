package stairway.to.java.BankAccountSystem;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    static String bank = "Java Digital Bank";

    public BankAccount(String accountHolder, int accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double makeDeposit(double value){
        balance += value;
        return balance;
    }

    public void withdrawal(double value){
        if (value <= balance) {
            balance -= value;
            System.out.println("Here's your money: " + value);
        }
        else{
            System.out.println("You can only withdrawal up to $" + balance);
        }
    }

    public void checkBalance(){
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Bank: " + bank);
        System.out.println("Balance: " + balance);
    }

    public void transfer(BankAccount receiver, double value){
        if (value <= balance) {
            balance -= value;
            receiver.balance = value;
            System.out.println("Your money has been transferred!");
        }
        else{
            System.out.println("Insufficient funds.");
        }
    }

}
