

public class Latte extends Beverages {
    public Latte() {
        description = "Latte";
    }

    @Override
    public double cost() {
        return 2.49;  // Base price of Latte
    }
}
