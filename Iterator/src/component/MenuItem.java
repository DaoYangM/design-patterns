package component;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean isVegetarian;
    private double price;

    public MenuItem(String name, String description, boolean isVegetarian, double price) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void print(int time) {
        String tab = "  ";
        for (int i = 0; i < time; i++) {
            tab += tab;
        }
        System.out.print(tab + getName());

        if (isVegetarian)
            System.out.print("(v)");
        System.out.println(", "  + getPrice());
        System.out.println(tab + "-- " + getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }
}
