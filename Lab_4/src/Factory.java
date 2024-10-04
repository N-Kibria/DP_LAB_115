
import java.util.HashMap;
import java.util.Map;

public class Factory {

    int c;
    Map<Integer, IAddCondiment> dict = new HashMap<>();



    {
        dict.put(1, new milk());
        dict.put(2, new whippedCream());
        dict.put(3, new whiteSugar());
    }


    public Beverages addCondiment(Beverages beverage, int choice) {
        IAddCondiment condiment = dict.get(choice);
        c++;

        if (condiment != null) {
            return condiment.addCondiment(beverage);
        }
        return beverage;
    }
}