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

    public BankAccount search(String name) throws AccountsNotFoundException {
        for(BankAccount account : this.accounts) {
            if (account.getOwner().equals(name)) return account;
        }
        throw new AccountsNotFoundException(name);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount("Mr Durand");
        try {
            BankAccount account = bank.search("Mr Durand");
            account.deposit(1000);
            account.withdraw(200);
            System.out.print("Solde du compte : " + account.getBalance());
        } catch (AccountsNotFoundException e) {
            System.out.println("Erreur à la recherche");
        }
    }
}
