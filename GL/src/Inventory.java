import java.util.ArrayList;
import java.util.List;

public class Inventory<T> {
    private List<T> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public List<T> getItems() {
        return items;
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> removeItem(T item) {
        items.remove(item);
        return items;
    }

    public int getItemCount() {
        return items.size();
    }
}