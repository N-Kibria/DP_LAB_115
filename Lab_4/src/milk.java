public class milk implements IAddCondiment{
    @Override
    public Beverages addCondiment(Beverages b)
    {
        //logic
        System.out.println("added milk");
        return b;
    }


}
