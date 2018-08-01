import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.iterator().hasNext();
    }

    @Override
    public MenuItem next() {
        return menuItems.iterator().next();
    }
}
