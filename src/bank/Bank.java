package bank;

import history.BankHistory;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts;

    private static Bank instance;

    private BankHistory history;

    private String name;

    private Bank() {
        this.history = new BankHistory(this);
        this.name = "Banque de test";
        this.accounts = new ArrayList<BankAccount>();
    }

    public static Bank getInstance() {
        if (instance == null) instance = new Bank();
        return instance;
    }

    public void addAccount(String name) {
        this.accounts.add(new BankAccount(name));
    }

    public BankAccount search(String name) throws AccountsNotFoundException {
        for(BankAccount account : this.accounts) {
            if (account.getOwner().equals(name)) return account;
        }
        throw new AccountsNotFoundException(name);
    }

    public List<BankAccount> getAccounts() {
        return this.accounts;
    }

    public BankHistory getHistory() {
        return this.history;
    }

    public String toString() {
        return "Bienvenue à la banque " + this.name;
    }
}
