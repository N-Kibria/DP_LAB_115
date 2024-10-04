import java.util.HashMap;
import java.util.Map;

public abstract class Beverages {
    protected String description = "Unknown Beverage";

    Map<IAddCondiment,Integer> ingredients  = new HashMap<>();


    public abstract double cost();


}
