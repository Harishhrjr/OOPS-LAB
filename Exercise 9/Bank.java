abstract class BankAccount {
    String accountHolder;
    double balance;
    
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    
    void displayBalance() {
        System.out.println(accountHolder + "'s balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
    
    
    void deposit(double amount) {
        balance += amount;
    }
    
        void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
    
    
    void deposit(double amount) {
        balance += amount;
    }
    
    
    void withdraw(double amount) {
        balance -= amount;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("Alice", 1000);
        BankAccount checking = new CheckingAccount("Bob", 500);
        
        savings.deposit(200);
        savings.withdraw(300);
        savings.displayBalance();
        
        checking.deposit(100);
        checking.withdraw(700);
        checking.displayBalance();
    }
}
