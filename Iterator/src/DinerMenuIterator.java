import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position ++;

        return menuItem;
    }
}
