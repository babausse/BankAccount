package history;

import command.Command;

import java.util.ArrayList;
import java.util.List;

public class AccountHistory {

    private List<Command> list;

    public AccountHistory() {
        this.list = new ArrayList<Command>();
    }

    public void add(Command command) {
        this.list.add(command);
    }

    public List<Command> getCommands() {
        return this.list;
    }

    public String toString() {
        return HistoryFormatter.format(list);
    }
}
