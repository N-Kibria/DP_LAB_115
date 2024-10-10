

public class Latte extends Beverages {
    public Latte() {

        description = "Latte";
        cost=3.99;
    }



    @Override
    public double totalcost(AddCondiment condiment) {
        cost=cost+ condiment.additionalcost();
        return cost;
    }
}
