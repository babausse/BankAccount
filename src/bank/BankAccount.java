package bank;

public class BankAccount {
    private int balance;

    private String owner;

    public BankAccount(String owner) {
        this.balance = 0;
        this.owner = owner;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }
}
