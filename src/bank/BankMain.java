package bank;

public class BankMain {

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
