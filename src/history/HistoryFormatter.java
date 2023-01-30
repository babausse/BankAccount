package history;

import command.Command;

import java.util.Collections;
import java.util.List;

public class HistoryFormatter {
    public static String format(List<Command> commands) {
        Collections.sort(commands);
        String result = "Nombre de commandes exécutées : " + commands.size() + "\n";
        for (Command command : commands) {
            result += "* " + command + "\n";
        }
        return result;
    }
}
