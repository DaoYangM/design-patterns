import java.util.Iterator;

public class Waitress {
    private Menu dinnerMenu;
    private Menu pancakeHouseMenu;

    public Waitress(Menu dinnerMenu, Menu pancakeHouseMenu) {
        this.dinnerMenu = dinnerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinnerMenu.createIterator();

        System.out.println("Menu\n----\nBREAKFAST");
        printMenu(pancakeIterator);

        System.out.println("Menu\n----\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if (menuItem == null)
                break;
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
