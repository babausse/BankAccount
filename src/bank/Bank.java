package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<BankAccount>();
    }

    public void addAccount(String name) {
        this.accounts.add(new BankAccount(name));
    }

    public BankAccount search(String name) {
        for(BankAccount account : this.accounts) {
            if (account.getOwner().equals(name)) return account;
        }
        throw new AccountsNotFoundException(name);
    }
}
