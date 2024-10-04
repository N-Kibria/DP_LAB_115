public class Capuccino extends Beverages {
    public Capuccino() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
