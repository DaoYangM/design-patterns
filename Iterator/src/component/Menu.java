package component;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    private ArrayList<MenuComponent> menuComponents;
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;

        menuComponents = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print(int time) {
        for (MenuComponent m: menuComponents) {
            String tab = "  ";
            for (int i = 0; i < time; i++) {
                tab += tab;
            }
            if (m instanceof Menu) {
                System.out.println(tab + m.getName() + " : " + m.getDescription());
                System.out.println(tab + "-------------------");
            }
            m.print(time + 1);
            System.out.println();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
