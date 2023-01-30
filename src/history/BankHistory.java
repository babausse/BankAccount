package history;

import bank.Bank;
import bank.BankAccount;
import command.Command;

import java.util.ArrayList;
import java.util.List;

public class BankHistory {
    private Bank bank;

    public BankHistory(Bank bank) {
        this.bank = bank;
    }

    public List<Command> getAllCommands() {
        List<Command> commands = new ArrayList<Command>();
        for(BankAccount account : bank.getAccounts()) {
            commands.addAll(account.getHistory().getCommands());
        }
        return commands;
    }

    public String toString() {
        return HistoryFormatter.format(getAllCommands());
    }

}
