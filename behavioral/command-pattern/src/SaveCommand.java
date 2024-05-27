import java.util.Map;

public class SaveCommand<T, S> implements TransactionCommand{
    private final Map<S, T> storageMap;
    private final T entity;
    private final S id;

    public SaveCommand(Map<S, T> storageMap, T entity, S id) {
        this.storageMap = storageMap;
        this.entity = entity;
        this.id = id;
    }

    @Override
    public void execute() {
        storageMap.put(id, entity);
    }

    @Override
    public void undo() {
        storageMap.remove(id);
    }
}
