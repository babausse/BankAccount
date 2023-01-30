package command;

import bank.BankAccount;

public class DepositCommand extends Command {

    private int amount;

    public DepositCommand(BankAccount account, int amount) {
        super(account);
        this.amount = amount;
    }

    @Override
    public void doExecute() {
        this.account.deposit(this.amount);
    }

    public String toString() {
        return this.timestamp + " | Opération de dépôt de " + this.amount + " chez " + this.account.getOwner();
    }
}
