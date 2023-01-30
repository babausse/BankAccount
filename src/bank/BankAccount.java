package bank;

import history.AccountHistory;

public class BankAccount {
    private int balance;

    private String owner;

    private AccountHistory history;

    public BankAccount(String owner) {
        this.balance = 0;
        this.owner = owner;
        this.history = new AccountHistory();
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

    public AccountHistory getHistory() {
        return this.history;
    }
}
