import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake  Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, and toast", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", false, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String desc, boolean isVegetarian, double price) {
        menuItems.add(new MenuItem(name, desc, isVegetarian, price));
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
