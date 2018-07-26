package component;

public abstract class Beverage {
    public String description = "Unknown component.Beverage";

    public CupSize size;

    public CupSize getSize() {
        return size;
    }

    public void setSize(CupSize size) {
        this.size = size;
    }

    public String getDescription() {
        return description + " " +size.toString();
    }

    public abstract double cost();
}
