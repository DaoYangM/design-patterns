import java.util.Iterator;

public class DinerMenu implements Menu {
    private MenuItem[] menuItems;
    private int numberOfItems = 0;
    private static final int MAX_ITEMS = 6;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin) Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hot dog", "A hot dog, with saurkraut,  relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name, String desc, boolean isVegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Sorry, menu is full! Can't add item to menu");
        else {
            MenuItem menuItem = new MenuItem(name, desc, isVegetarian, price);
            menuItems[numberOfItems] = menuItem;
            numberOfItems ++;
        }
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
