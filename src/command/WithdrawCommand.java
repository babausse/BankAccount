package command;

import bank.BankAccount;

public class WithdrawCommand extends Command {

    private int amount;

    public WithdrawCommand(BankAccount account, int amount) {
        super(account);
        this.amount = amount;
    }

    @Override
    public void doExecute() {
        this.account.withdraw(this.amount);
    }
    public String toString() {
        return this.timestamp + " | Opération de retrait de " + this.amount + " chez " + this.account.getOwner();
    }
}
