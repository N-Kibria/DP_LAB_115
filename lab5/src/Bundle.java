import java.util.ArrayList;
import java.util.List;

abstract class Bundle implements IProduct {

    public String name;
    public int count=0;

    public List<IProduct> components= new ArrayList<>();
    @Override
    public double calculateTotalPrice()
    {
        return 0;
    }
    public abstract void CreateBundle();
    public abstract void display();


}