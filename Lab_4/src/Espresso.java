public class Espresso extends Beverages {


    public Espresso() {
        description = "Espresso";
        cost = 1.99;
    }

    @Override
    public double totalcost(AddCondiment condiment) {

        cost=cost+ condiment.additionalcost();
        return cost;
    }

}
