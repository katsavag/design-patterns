import java.util.Stack;

public class TransactionManager {
    private final Stack<TransactionCommand> commandStack = new Stack<>();

    public void executeCommand(TransactionCommand command) {
        command.execute();
        commandStack.push(command);
    }

    public void rollback() {
        while (!commandStack.isEmpty()) {
            TransactionCommand command = commandStack.pop();
            command.undo();
        }
    }
}
