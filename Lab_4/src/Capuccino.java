public class Capuccino extends Beverages {
    public Capuccino() {

        description = "Capuccino";
        cost=2.99;
    }

    @Override
    public double totalcost(AddCondiment condiment) {
        cost=cost+ condiment.additionalcost();
        return cost;
    }
}
