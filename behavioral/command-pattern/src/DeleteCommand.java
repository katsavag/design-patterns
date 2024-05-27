import java.util.Map;

public class DeleteCommand<T, S> implements TransactionCommand{
    private final Map<S, T> storageMap;
    private final S id;
    private T entity;

    public DeleteCommand(Map<S, T> storageMap, S id) {
        this.storageMap = storageMap;
        this.id = id;
    }

    @Override
    public void execute() {
        entity = storageMap.remove(id);
    }

    @Override
    public void undo() {
        if (entity != null) {
            storageMap.put(id, entity);
        }
    }
}
