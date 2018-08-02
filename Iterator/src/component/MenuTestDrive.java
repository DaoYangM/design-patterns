package component;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinnerMenu = new Menu("Dinner MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert MENU", "Dessert of course!");

        MenuComponent allMenu = new Menu("ALL Menus", "All menus combined");
        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinnerMenu);
        allMenu.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake  Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, and toast", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", false, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59));

        dinnerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread" ,true, 3.89));
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));
        dinnerMenu.add(dessertMenu);

        Waitress waitress = new Waitress(allMenu);
//        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
