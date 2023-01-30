package command;

import bank.BankAccount;

import java.time.LocalTime;

public abstract class Command implements Comparable<Command> {
    protected BankAccount account;

    protected LocalTime timestamp;

    public Command(BankAccount account) {
        this.account = account;
    }

    public void execute() {
        this.timestamp = LocalTime.now();
        this.account.getHistory().add(this);
        this.doExecute();
    }
    @Override
    public int compareTo(Command other) {
        return this.timestamp.compareTo(other.getTimestamp());
    }

    public LocalTime getTimestamp() {
        return this.timestamp;
    }

    public abstract void doExecute();
}
