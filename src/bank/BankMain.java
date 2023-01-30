package bank;

import command.DepositCommand;
import command.WithdrawCommand;

public class BankMain {

    public static void main(String[] args) {
        Bank bank = Bank.getInstance();
        bank.addAccount("Mr Durand");
        bank.addAccount("Mme Masson");

        System.out.println(Bank.getInstance());
        try {
            BankAccount account = bank.search("Mr Durand");
            BankAccount secondAccount = bank.search("Mme Masson");
            (new DepositCommand(account, 1000)).execute();
            (new DepositCommand(secondAccount, 200)).execute();
            (new WithdrawCommand(account, 200)).execute();
            System.out.println("Solde du compte : " + account.getBalance());
            System.out.println(account.getHistory());
            System.out.println(secondAccount.getHistory());

            System.out.println(Bank.getInstance().getHistory());
        } catch (AccountsNotFoundException e) {
            System.out.println("Erreur à la recherche");
        }
    }
}
