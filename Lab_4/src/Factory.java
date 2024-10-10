import java.util.HashMap;
import java.util.Map;

public class Factory {

    Map<Integer, AddCondiment> condiments = new HashMap<>();
    Map<Integer, Beverages> beverages = new HashMap<>();

    {

        condiments.put(1, new milk());
        condiments.put(2, new whippedCream());
        condiments.put(3, new whiteSugar());


        beverages.put(1, new Espresso());
        beverages.put(2, new Latte());
        beverages.put(3, new Capuccino());
    }

    public Beverages createBeverage(int choice) {
        return beverages.get(choice);
    }
    public AddCondiment Addcondiment(int choice) {
        return condiments.get(choice);
    }
    public Beverages addCondiment(Beverages beverage, int choice) {
        AddCondiment condiment = condiments.get(choice);

        if (condiment != null) {
            return condiment.addCondiment(beverage);
        }
        return beverage;
    }

    public double cost(Beverages beverage,AddCondiment condiment){
        return beverage.totalcost(condiment);
    }
}
