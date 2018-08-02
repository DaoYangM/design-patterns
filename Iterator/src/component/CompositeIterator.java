package component;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    private Stack<Iterator> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty())
            return false;
        else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else
                return true;
        }
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator iterator = stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu)
                stack.push(component.createIterator());
            return component;
        } else
            return null;
    }
}
